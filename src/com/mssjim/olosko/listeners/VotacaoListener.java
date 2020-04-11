package com.mssjim.olosko.listeners;

import com.mssjim.olosko.Main;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class VotacaoListener extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent event) {

    	Guild g = event.getGuild();
    	Message m = event.getMessage();
    	TextChannel c;
    	
    	if(!m.getMentionedChannels().isEmpty() && m.getMember().hasPermission(Permission.ADMINISTRATOR)) {
    		c = m.getMentionedChannels().get(0);
    		
        	event.getTextChannel().sendMessage("Digite a Mensagem da Vota��o:").queue();
        	
        	g.getJDA().addEventListener(new MSGVotacaoListener(m.getMember()));
        	try {
				this.finalize();
			} catch (Throwable e) {
				e.printStackTrace();
			}
    	}
    	return;
	}
}

final class MSGVotacaoListener extends ListenerAdapter {
	
	Member u;
	
	public MSGVotacaoListener(Member u) {
		this.u = u;
	}
	
	public void onMessageReceived(MessageReceivedEvent event) {

    	Guild g = event.getGuild();
    	Message m = event.getMessage();
    	
    	if(m.getMember().equals(u)) {
    		
        	event.getTextChannel().sendMessage("Emojis:").queue();

        	g.getJDA().addEventListener(new EmojiVotacaoListener(u, m.getContentDisplay()));
        	try {
				this.finalize();
			} catch (Throwable e) {
				e.printStackTrace();
			}
    	}
    	return;
	}
}

final class EmojiVotacaoListener extends ListenerAdapter {
	
	Member u;
	String msg;
	
	public EmojiVotacaoListener(Member u, String s) {
		this.u = u;
		this.msg = s;
	}
	
	public void onMessageReceived(MessageReceivedEvent event) {

    	Guild g = event.getGuild();
    	Message m = event.getMessage();
    	
    	if(m.getMember().equals(u)) {

        	event.getTextChannel().sendMessage("**Teste**").queue();
        	event.getTextChannel().sendMessage(msg).queue();

        	g.getJDA().addEventListener(new EmojiVotacaoListener(u, m.getContentDisplay()));
        	Main.finalizarVotacao();
        	System.out.println("Fim");
        	try {
				this.finalize();
			} catch (Throwable e) {
				e.printStackTrace();
			}
        	System.out.println("fim2");
    	}
    	return;
	}
}
