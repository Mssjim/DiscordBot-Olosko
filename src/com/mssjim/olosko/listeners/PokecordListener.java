package com.mssjim.olosko.listeners;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PokecordListener extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent event) {

		// Private Message
        if(event.getChannelType() == ChannelType.PRIVATE) {
            return;
        }
        
    	Guild g = event.getGuild();
    	Message m = event.getMessage();
    	MessageEmbed e;
    	
    	if(!event.getAuthor().getId().equals("365975655608745985")) {
    		return;
    	}
    	
    	if(m.getEmbeds().isEmpty()) {
    		event.getMessage().delete().queue();
    		event.getTextChannel().sendMessage(event.getMessage()).queue();
    	} else {
    		e = m.getEmbeds().get(0);
    		
    		if(e.getTitle().toLowerCase().contains("wild")) {
    			event.getMessage().delete().queue();
    			
        		event.getTextChannel().sendMessage(e).queue();
    		}
    	}
	}
}
