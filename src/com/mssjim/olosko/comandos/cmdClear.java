package com.mssjim.olosko.comandos;

import java.util.List;

import com.mssjim.olosko.core.Command;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdClear implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
    	
    	if(!event.getGuild().getMemberById(event.getAuthor().getId()).hasPermission(Permission.MESSAGE_MANAGE)) {
    		event.getTextChannel().sendMessage("Voc� n�o possui permiss�es necess�rias para isto!").queue();
    		return;
    	}
    	
    	if(args.length < 1) {
    		event.getTextChannel().sendMessage("Voc� precisa especificar quantas mensagens deseja deletar!").queue();
    		return;
    	}
    	
    	int valor = 0;
    	
    	try {
			valor = Integer.parseInt(event.getMessage().getContentDisplay().substring(7));
		} catch (Exception e) {
			System.out.println(event.getMessage().getContentDisplay().substring(7));
			event.getTextChannel().sendMessage("Especifique um valor v�lido!").queue();
			return;
		}
    	
    	if(valor > 100) {
    		event.getTextChannel().sendMessage("Limite de 100 mensagens ;-;").queue();
    		return;
    	} else if(valor == 100) {
    		valor = 99;
    	}

    	List<Message> messages = event.getChannel().getHistory().retrievePast(valor + 1).complete();
    	event.getChannel().purgeMessages(messages);
    	
    	event.getTextChannel().sendMessage("**" + valor + "** mensagens foram deletadas!").queue();
    	
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
    	
    }

    @Override
    public String help() {
        return null;
    }
}
