package com.mssjim.olosko.comandos;

import com.mssjim.olosko.core.Command;
import com.mssjim.olosko.utils.Utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class cmdHelp implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage(new EmbedBuilder()
        		.setColor(Utils.getRandomColor())
        		.setAuthor("Lista de Comandos")
        		.setDescription(""
        				+ "`;info` -> Exibe informa��es sobre o Bot"
        				+ "\n`;help` -> Exibe a lista de comandos"
        				+ "\n`;say [mensagem]` -> Me faz dizer algo"
        				+ "\n`;ping` -> Exibe a lat�ncia do Bot"
        				+ "\n`;ban [Usu�rio]` -> Bane aqueles que n�o se comportam")
        		.build()
        ).queue();
        event.getTextChannel().sendMessage(new EmbedBuilder()
        		.setColor(Utils.getRandomColor())
        		.setAuthor("Comandos de Modera��o")
        		.setDescription(""
        				+ "`;mute [Usu�rio(s)]` -> Sil�ncia um ou v�rios membros"
        				+ "\n`;unmute [Usu�rio(s)]` -> Desmuta um ou v�rios membros"
        				+ "\n`;kick [Usu�rio(s)]` -> Kicka um ou v�rios membros do servidor"
        				+ "\n`;clear [valor]` -> Apaga mensagens de um canal"
        				+ "\n`;verificar [Usu�rio(s)]` -> Verifica e aprova membros")
        		.setFooter("Bot404")
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
}
