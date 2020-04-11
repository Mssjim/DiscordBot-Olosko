package com.mssjim.olosko.comandos;

import java.awt.Color;
import java.util.Random;

import com.mssjim.olosko.core.Command;
import com.mssjim.olosko.utils.Utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdPoke implements Command {
	
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
    	event.getMessage().delete().queue();
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
   
    	event.getTextChannel().sendMessage(new EmbedBuilder()
    			.setColor(new Color(49, 210, 102))
    			.setAuthor("‌‌A wild pokémon has аppeаred!")
    			.setImage(Utils.getPoke(new Random().nextInt(13)))
    			.setDescription("Guess the pokémon аnd type .cаtch <pokémon> to cаtch it!")
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
