package com.mssjim.olosko.core;

import java.awt.Color;
import java.util.Random;

import com.mssjim.olosko.Main;
import com.mssjim.olosko.utils.Utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

    	User a = event.getAuthor();
    	
    	// Bot Message
        if(event.getAuthor().isBot()) {
            return;
        }

        // Private Message
        if(event.getChannelType() == ChannelType.PRIVATE) {
            System.out.println("Mensagem Privada de " + a.getAsTag() + ": " + event.getMessage().getContentDisplay());
            a.openPrivateChannel().complete().sendMessage("Acesse nosso Servidor do Discord :heart:! " + Utils.getInvite).queue();
            Main.jda.getGuildsByName("Pisciss", true).get(0).getMemberByTag("Mssjim#4702").getUser().openPrivateChannel().complete().sendMessage("Mensagem Privada de " + a.getAsTag() + ": " + event.getMessage().getContentDisplay()).queue();
            return;
        }
        
    	Guild g = event.getGuild();
    	Member u = event.getMember();
    	Message m = event.getMessage();
    	
    	
    	if(Main.log) {
    		if(event.getMessage().getEmbeds().isEmpty()) {
    			System.out.println(g.getName() + " - " + event.getTextChannel().getName() + ": <" + u.getUser().getName() + "> " + m.getContentRaw());
    		} else {
    			System.out.println(g.getName() + " - " + event.getTextChannel().getName() + ": <" + u.getUser().getName() + "> " + m.getEmbeds().get(0).getTitle() + " / " + m.getEmbeds().get(0).getDescription());
    		}
    	}

        // Comando
        String message = m.getContentDisplay();
        if(message.startsWith(Utils.getPrefix)) {
            CommandHandler.handlerCommand(CommandHandler.parse.parse(m.getContentDisplay(), event));
        }
        
        // Gartic Role
        //if(event.getChannel().getId().equals("651556731972878346")) {
        //	event.getGuild().addRoleToMember(u, g.getRolesByName("GARTICMOD", false).get(0)).queue();
        //}
        
        if(m.getContentDisplay().contains(":glu:") || m.getContentDisplay().toLowerCase().equals("glu")) {
        	event.getTextChannel().sendMessage("<:glu:655102878972772372>").queue();
        }

        if (m.getContentDisplay().toLowerCase().equals("hm") ||
        	m.getContentDisplay().toLowerCase().equals("hum") ||
        	m.getContentDisplay().toLowerCase().equals("hmm") ||
        	m.getContentDisplay().toLowerCase().equals("hmmm")) {
        	
        	switch(new Random().nextInt(2)) {
        		case 0:
        			event.getTextChannel().sendMessage("Dois").queue();
        			break;
        		default:
        			event.getTextChannel().sendMessage("2").queue();
        	}
        }
        
        if (m.getContentDisplay().toLowerCase().equals("3") ||
            m.getContentDisplay().toLowerCase().equals("tres") ||
            m.getContentDisplay().toLowerCase().equals("três") ||
            m.getContentDisplay().toLowerCase().equals("trex")) {
        	if (event.getChannel().getHistory().retrievePast(2).complete().get(1).getContentDisplay().equals("Dois") ||
        		event.getChannel().getHistory().retrievePast(2).complete().get(1).getContentDisplay().equals("2")) {
        		event.getTextChannel().sendMessage("Agora vem de 4 :smirk:").queue();
        	}
        }
        
        if(m.getContentDisplay().toLowerCase().equals("0011557733")) {
        	event.getGuild().getMemberById(event.getAuthor().getId()).getUser().openPrivateChannel().complete().sendMessage(
        			new EmbedBuilder()
        			.setImage("https://imgur.com/Wgi8NWZ.png")
        			.build()
        			).queue();
        	g.getTextChannelById("658846682062258176").sendMessage(a.getName() + " Acertou o codigo").queue();
        }
        
        if(m.getContentDisplay().toLowerCase().equals(".info ameno") || m.getContentDisplay().toLowerCase().equals(".info dorime")) {
        	event.getTextChannel().sendMessage(new EmbedBuilder()
        			.setColor(new Color(49, 210, 102))
        			.setAuthor("Base stats for God Ratão")
        			.setImage(Utils.getPoke(12))
        			.setDescription("Type: God\n" + 
        					"**HP:** ?\n" + 
        					"**Attack:** ?\n" + 
        					"**Defense:** ?\n" + 
        					"**Sp. Atk:** ?\n" + 
        					"**Sp. Def:** ?\n" + 
        					"**Speed:** ?")
        			.build()
        	).queue();
        }
        
        if(m.getContentDisplay().toLowerCase().equals("taca a mae") || m.getContentDisplay().toLowerCase().equals("taca a mãe")) {
        	event.getTextChannel().sendMessage("pra ver se quica").queue();
        }
        
        // IdleRPG
        if(event.getAuthor().getId().equals("424606447867789312")) {
        	if(m.getContentDisplay().toLowerCase().contains("é **tails**")) {
        		switch (new Random().nextInt(3)) {
        			case 0:
        				event.getTextChannel().sendMessage("Tadin :gatosad3:").queue();
        				break;
        			case 1:
        				event.getTextChannel().sendMessage(":mds:").queue();
        				break;
        			default:
        				break;
    			}
        	}
    	}
        
        // Random Message
        if(new Random().nextInt(100) == 0) {
        	if(!event.getChannel().getId().equals(Utils.getPokecordChannel)) {
        		switch (new Random().nextInt(2)) {
				case 0:
	            	event.getTextChannel().sendMessage("Olosko").queue();
					break;
				default:
	            	event.getTextChannel().sendMessage("Ban no Jappa <:martelindoban:650891769801605124>").queue();
					break;
				}
        	} else {
            	g.getTextChannelById(Utils.getLogChannel).sendMessage("Fake Poke - " + event.getTextChannel().getName()).queue();
            	event.getTextChannel().sendMessage(new EmbedBuilder()
            			.setColor(new Color(49, 210, 102))
            			.setAuthor("‌‌A wild pokémon has аppeаred!")
            			.setImage(Utils.getPoke(new Random().nextInt(13)))
            			.setDescription("Guess the pokémon аnd type .cаtch <pokémon> to cаtch it!")
            			.build()
            	).queue();
            }
        }
    }
}
