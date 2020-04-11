package com.mssjim.olosko.comandos;

import com.mssjim.olosko.Main;
import com.mssjim.olosko.core.Command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdInfo implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	// Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
    	
        event.getTextChannel().sendMessage(
        		new EmbedBuilder()
        		.setAuthor("Olosko Bot", null, event.getGuild().getIconUrl())
        		.setThumbnail(Main.jda.getSelfUser().getAvatarUrl())
        		.addField(":ping_pong: Ping", Main.jda.getGatewayPing() + "ms", true)
        		.addField(":floppy_disk: Mem�ria alocada: ", format(runtime.totalMemory() - runtime.freeMemory()) + "/" + format(runtime.maxMemory()), false)
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
    
    public static String format(double bytes) {
        String[] dictionary = { "bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB" };
        int index = 0;
        for (index = 0; index < dictionary.length; index++) {
            if (bytes < 1024) {
                break;
            }
            bytes = bytes / 1024;
        }
        return String.format("%.2f", bytes) + " " + dictionary[index];
    }
}
