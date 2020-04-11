package com.mssjim.olosko.comandos;

import com.mssjim.olosko.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cmdBan implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
    	
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	List<String> gifs = new ArrayList<String>();
    	gifs.add("https://i.imgur.com/QQV0Ybl.gif");
    	gifs.add("https://i.imgur.com/r42VJvZ.gif");
    	gifs.add("https://i.imgur.com/bfOSpyg.gif");
    	gifs.add("https://i.imgur.com/oTyqQAS.gif");
    	gifs.add("https://i.imgur.com/8d6Oakt.gif");
    	gifs.add("https://i.imgur.com/pgAybBd.gif");
    	gifs.add("https://i.imgur.com/RkIfjMP.gif");
    	
    	String gif = gifs.get(new Random().nextInt(gifs.size()));

    	if(event.getMessage().getMentionedMembers().isEmpty()) {
    		event.getTextChannel().sendMessage("Martelin do Ban ir� cantar!!!\n" + gif).queue();
    	    return;
    	}
    	
    	
    	if(event.getAuthor().getAsTag().equals("JappaBR#8590")) {
    		event.getTextChannel().sendMessage("<:ban:658118792261402626> Martelin do Ban cantou pro **" + event.getGuild().getMemberByTag("JappaBR#8590").getUser().getName() + "**\n" + gif).queue();
    	} else {
    		event.getTextChannel().sendMessage("<:ban:658118792261402626> Martelin do Ban cantou pro **" + event.getMessage().getMentionedMembers().get(0).getUser().getName() + "**\n" + gif).queue();
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
