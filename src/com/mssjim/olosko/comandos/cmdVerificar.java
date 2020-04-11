package com.mssjim.olosko.comandos;

import java.util.List;

import com.mssjim.olosko.core.Command;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdVerificar implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	List<Member> u = event.getMessage().getMentionedMembers();
    	
    	if(!event.getGuild().getMemberById(event.getAuthor().getId()).hasPermission(Permission.MESSAGE_MANAGE)) {
    		event.getTextChannel().sendMessage("Voc� n�o possui permiss�es necess�rias para isto!").queue();
    		return;
    	}
    	
    	if(u.isEmpty()) {
    		event.getTextChannel().sendMessage("Voc� precisa mencionar os Membros!").queue();
    	    return;
    	}

    	for(int i = 0; i < u.size(); i++) {
    		
    		if(u.get(i).getUser().isBot()) {
                event.getTextChannel().sendMessage(":x: O usu�rio " + u.get(i).getAsMention() + " n�o foi aprovado! Motivo: `Bot`").queue();
                return;
    		}
    		
    		if(u.get(i).getUser().isFake()) {
    			event.getTextChannel().sendMessage(":grey_exclamation: Usu�rio suspeito...").queue();
    		}
    		
    		//if(u.get(i).getUser().get) {
    		//	event.getTextChannel().sendMessage(":grey_exclamation: Usu�rio suspeito...").queue();
    		//}
    		
    		
    		event.getGuild().addRoleToMember(u.get(i).getId(), event.getGuild().getRoleById("666842359119478814")).queue();
    		
    		event.getGuild().removeRoleFromMember(u.get(i).getId(), event.getGuild().getRoleById("664239888975265813")).queue();

            event.getTextChannel().sendMessage(":white_check_mark: O usu�rio " + u.get(i).getAsMention() + " foi aprovado! por " + event.getGuild().getMember(event.getAuthor()).getNickname()).queue();
    	}
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
    	
    }

    @Override
    public String help() {
        return null;
    }
}
