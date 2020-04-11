package com.mssjim.olosko.comandos;

import com.mssjim.olosko.core.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdPing implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage("**:ping_pong: Pong! **" + event.getJDA().getGatewayPing() /3 + "ms").queue();
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }
}
