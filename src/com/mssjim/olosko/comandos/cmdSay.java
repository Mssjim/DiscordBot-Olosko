package com.mssjim.olosko.comandos;

import com.mssjim.olosko.core.Command;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdSay implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
    	event.getMessage().delete().queue();
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	if(event.getMessage().getContentDisplay().contains("@everyone") && !event.getMember().hasPermission(Permission.MESSAGE_MENTION_EVERYONE)) {
    		event.getTextChannel().sendMessage(event.getMessage().getContentDisplay().substring(5).replace("@everyone", "@everyοne")).queue();
    		return;
    	}
    	
    	if(event.getMessage().getContentDisplay().contains("@here") && !event.getMember().hasPermission(Permission.MESSAGE_MENTION_EVERYONE)) {
    		event.getTextChannel().sendMessage(event.getMessage().getContentDisplay().substring(5).replace("@here", "@aqui")).queue();
    		return;
    	}
    	
        event.getTextChannel().sendMessage(event.getMessage().getContentRaw().substring(5)).queue();
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }
}
