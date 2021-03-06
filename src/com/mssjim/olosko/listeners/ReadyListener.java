package com.mssjim.olosko.listeners;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {

    public void onReady(ReadyEvent event) {
        System.out.println("Servidores:");

        for(Guild g: event.getJDA().getGuilds()) {
            System.out.println(g.getName() + " - " + g.getMemberCount());
        }
    }
}
