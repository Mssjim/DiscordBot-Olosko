package com.mssjim.olosko.comandos;

import java.util.List;

import com.mssjim.olosko.core.Command;
import com.mssjim.olosko.utils.Utils;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdApagar implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {  
    	if(event.getGuild().getMemberById(event.getAuthor().getId()).hasPermission(Permission.ADMINISTRATOR)) {
    		List<Member> m = event.getGuild().getMembers();
    		
    		event.getTextChannel().sendMessage("**NATAL!!! Comando desativado ;-;**").queue();
    		
    		for(int i = 0; i < m.size(); i++) {
    			event.getGuild().getTextChannelById(Utils.getLogChannel).sendMessage(i + " - " + m.get(i).getUser().getAsTag()).queue();
    			if(!m.get(i).getUser().isBot()) {
    				m.get(i).getUser().openPrivateChannel().complete().sendMessage(":heart: Que a alegria do Natal invada sua casa e fa�a morada por todos os cantos!!!\n **Feliz Nataaaalll!!! <:GodRat:658118876839673856>**").queue();
    			}
    		}
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
