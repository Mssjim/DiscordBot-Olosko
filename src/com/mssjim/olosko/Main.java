package com.mssjim.olosko;

import javax.security.auth.login.LoginException;

import com.mssjim.olosko.utils.Utils;
import com.mssjim.olosko.comandos.cmdBan;
import com.mssjim.olosko.comandos.cmdClear;
import com.mssjim.olosko.comandos.cmdHelp;
import com.mssjim.olosko.comandos.cmdInfo;
import com.mssjim.olosko.comandos.cmdKick;
import com.mssjim.olosko.comandos.cmdMorre;
import com.mssjim.olosko.comandos.cmdMute;
import com.mssjim.olosko.comandos.cmdPing;
import com.mssjim.olosko.comandos.cmdPoke;
import com.mssjim.olosko.comandos.cmdSay;
import com.mssjim.olosko.comandos.cmdTeste;
import com.mssjim.olosko.comandos.cmdUnmute;
import com.mssjim.olosko.comandos.cmdUserInfo;
import com.mssjim.olosko.comandos.cmdVerificar;
import com.mssjim.olosko.core.CommandHandler;
import com.mssjim.olosko.core.MessageListener;
import com.mssjim.olosko.listeners.MemberJoinListener;
import com.mssjim.olosko.listeners.ReadyListener;
import com.mssjim.olosko.listeners.VotacaoListener;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.EventListener;

public class Main {
    public static JDA jda;
    static EventListener votacao;
    public static boolean log = false;

    public static void main(String[] args) {
	    String token = Utils.getToken;

        JDABuilder builder = new JDABuilder(AccountType.BOT)
                .setToken(token)
                .setAutoReconnect(true)
                //.setActivity(Activity.watching("Porn Hub"));
                .setActivity(Activity.listening("ASMR"));
        
        votacao = new VotacaoListener();

        // Listeners
        builder.addEventListeners(new ReadyListener());
        builder.addEventListeners(new MessageListener());
        builder.addEventListeners(new MemberJoinListener());
        //builder.addEventListeners(new PokecordListener());

        // Geral
        CommandHandler.commands.put("say", new cmdSay());
        CommandHandler.commands.put("ping", new cmdPing());
        CommandHandler.commands.put("help", new cmdHelp());
        CommandHandler.commands.put("ban", new cmdBan());
        CommandHandler.commands.put("poke", new cmdPoke());
        CommandHandler.commands.put("info", new cmdInfo());
        CommandHandler.commands.put("teste", new cmdTeste());

        // Moderação
        CommandHandler.commands.put("userinfo", new cmdUserInfo());
        CommandHandler.commands.put("mute", new cmdMute());
        CommandHandler.commands.put("unmute", new cmdUnmute());
        CommandHandler.commands.put("kick", new cmdKick());
        CommandHandler.commands.put("clear", new cmdClear());
        CommandHandler.commands.put("morre", new cmdMorre());
        CommandHandler.commands.put("verificar", new cmdVerificar());
        //CommandHandler.commands.put("votacao", new cmdVotacao());
        //CommandHandler.commands.put("natal", new cmdNatal());
        
        try {
            jda = builder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
    
    public static void morre(String u) {
    	jda.shutdown();
    	System.out.println("Morto por " + u);
    }
    
    public static void iniciarVotacao() {
    	jda.addEventListener(votacao);
    }
    
    public static void finalizarVotacao() {
    	jda.removeEventListener(votacao);
    }
}
