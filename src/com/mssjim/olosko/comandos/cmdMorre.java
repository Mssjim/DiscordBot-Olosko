package com.mssjim.olosko.comandos;

import com.mssjim.olosko.Main;
import com.mssjim.olosko.core.Command;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdMorre implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	if(event.getMember().hasPermission(Permission.ADMINISTRATOR)) {
    		Main.morre(event.getMember().getUser().getAsTag());
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
