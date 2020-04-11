package com.mssjim.olosko.comandos;

import java.time.OffsetDateTime;

import com.mssjim.olosko.core.Command;
import com.mssjim.olosko.utils.Utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdUserInfo implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	Member u;
    	
    	try {
    		u = event.getGuild().getMemberById(event.getMessage().getContentDisplay().substring(10));
    		u.getUser();
    	} catch (Exception e) {
    		event.getTextChannel().sendMessage("Usu�rio n�o encontrado :glu:").queue();
    		return;
		}
    	
    	OffsetDateTime t = u.getTimeJoined();

        event.getTextChannel().sendMessage(
        		new EmbedBuilder()
        			.setColor(Utils.getRandomColor())
        			.setAuthor(u.getNickname() + " - " + u.getUser().getAsTag())
        			.setThumbnail(u.getUser().getAvatarUrl())
        			.addField(":date:Entrou no Discord em:", t.getDayOfMonth() + "/" + t.getMonthValue() + "/" + t.getYear(), false)
        			.build()
        		).queue();
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }
}
