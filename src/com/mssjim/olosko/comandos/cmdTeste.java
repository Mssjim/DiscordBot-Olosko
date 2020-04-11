package com.mssjim.olosko.comandos;

import com.mssjim.olosko.core.Command;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdTeste implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
    	//event.getMessage().delete().queue();
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
   
    	event.getTextChannel().sendMessage("<:mood:623143667921584136>\n" + 
    			"<:ban:658118792261402626> \n" + 
    			"<:unban:658118792857124894> \n" + 
    			"<:GodRat:658118876839673856>").queue();
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }
}
