package com.mssjim.olosko.comandos;

import java.util.List;

import com.mssjim.olosko.Main;
import com.mssjim.olosko.core.Command;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdVotacao implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	if(event.getGuild().getMemberById(event.getAuthor().getId()).hasPermission(Permission.ADMINISTRATOR)) {
    		List<Member> m = event.getGuild().getMembers();
    		event.getTextChannel().sendMessage("Em qual canal deseja realizar a vota��o?").queue();
    		Main.iniciarVotacao();
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
