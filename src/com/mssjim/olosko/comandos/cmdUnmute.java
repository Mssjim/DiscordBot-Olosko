package com.mssjim.olosko.comandos;

import java.time.OffsetDateTime;
import java.util.List;

import com.mssjim.olosko.core.Command;
import com.mssjim.olosko.utils.Utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdUnmute implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	List<Member> u = event.getMessage().getMentionedMembers();
    	Guild g = event.getGuild();
    	Role r = g.getRolesByName("Muted", true).get(0);
    	
    	if(!event.getGuild().getMemberById(event.getAuthor().getId()).hasPermission(Permission.MANAGE_ROLES)) {
    		event.getTextChannel().sendMessage("Voc� n�o possui permiss�es necess�rias para isto!").queue();
    		return;
    	}
    	
    	if(u.isEmpty()) {
    		event.getTextChannel().sendMessage("Voc� precisa mencionar os Membros que ser�o desmutados!").queue();
    	    return;
    	}
    	
    	OffsetDateTime t = event.getMessage().getTimeCreated().minusHours(3);

    	for(int i = 0; i < u.size(); i++) {
    		g.removeRoleFromMember(u.get(i), r).queue();

            event.getTextChannel().sendMessage(
            		new EmbedBuilder()
            		.setColor(Utils.getRandomColor())
            		.setAuthor("Martelin do Unmute", null, Utils.getMartelindoUnmute)
            		.setDescription("O usu�rio **" + u.get(i).getUser().getName() + "** foi salvo pelo Deus Rat�o <:GodRat:658118876839673856>\n Agora ele j� pode voltar a falar! :loudspeaker:")
            		.setThumbnail(u.get(i).getUser().getAvatarUrl())
            		.setFooter("Desmutado por " + event.getAuthor().getName() + " - " + t.getHour() + ":" + t.getMinute(), event.getAuthor().getAvatarUrl())
            		.build()
            ).queue();
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
