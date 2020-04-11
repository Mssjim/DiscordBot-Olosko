package com.mssjim.olosko.listeners;

import com.mssjim.olosko.utils.Utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MemberJoinListener extends ListenerAdapter {
	
	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		User u = event.getUser();
		Guild g = event.getGuild();
		String avatar;
				
		if(u.getAvatarUrl() == null) {
			avatar = u.getDefaultAvatarUrl();
		} else {
			avatar = u.getAvatarUrl();
		}
		
		event.getGuild().getTextChannelById(Utils.getWelcomeChannelID).sendMessage(
				new EmbedBuilder()
				.setColor(Utils.getRandomColor())
				.setAuthor("Seja Bem Vindo(a) " + u.getName(), null, g.getIconUrl())
				.setDescription("Agora voc� faz parte da nossa fam�lia :heart:"
						+ "\nEstamos crescendo, agora somos **" + g.getMembers().size() + "** membros!")
				.setThumbnail(avatar)
				.setFooter("OLOSKO", null)
				.build()				
		).queue();
		
		if(!u.isBot()) {
			u.openPrivateChannel().complete().sendMessage("**Ol� "+ u.getName() + " Seja Bem Vindo(a) ao Mec�nicos do Futuro** :wink:\n" +
				":heart: E aos nossos cora��es...\n" +
				"Sinta-se a vontade para fazer novas amizades e se divertir xD\n" + 
				"\n" + 
				//"Voc� est� em processo de avalia��o, aguarde a sua aprova��o para ter acesso a todos os canais do servidor\n" +
				"Qualquer d�vida entre em contato com a nossa Staff!").queue();
		}
		
		System.out.println("Novo Membro: " + u.getAsTag());
		
		// Verifica��o
		if(u.isBot()) {
			event.getGuild().getTextChannelById(Utils.getWelcomeChannelID).sendMessage(":warning: **Bot** @everyone").queue();
		}
		
		if(u.isFake()) {
			event.getGuild().getTextChannelById(Utils.getWelcomeChannelID).sendMessage(":warning: @everyone").queue();
		}
		
		
	}	
}
