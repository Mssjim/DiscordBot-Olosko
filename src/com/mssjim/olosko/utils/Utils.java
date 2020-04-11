package com.mssjim.olosko.utils;

import java.awt.Color;
import java.util.Random;

public class Utils {
    public static String getPrefix = ";";
    public static String getInvite = "https://discord.gg/NmSyFcr";
    public static String getToken = "NjU0NzQ2NTM1MDY5ODc2MjYz.XfKDiw.qBBl9kZOMuvXvXELK1jxymGbZsE";
    public static String getWelcomeChannelID = "672817400999313422";
    public static String getLogChannel = "658654437471944704";
    public static String getPokecordChannel = "667076092171124778";

    public static String getMartelindoMute = "https://imgur.com/jwjxtOx.png";
    public static String getMartelindoUnmute = "https://imgur.com/UuovdFP.png";
    public static String getMartelindoBan = "https://imgur.com/lfvDEV4.png";
    public static String getMartelindoUnban = "https://imgur.com/gaYelHn.png";
    public static String getGodRat = "https://imgur.com/OnDNhwJ.png";
    
    public static Color getRandomColor() {
    	Random rand = new Random();
    	return new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
    }

    public static String getPoke(int poke) {
    	switch (poke) {
		case 0:
			return "https://images-ext-2.discordapp.net/external/GpeS3L_dVPK6jR1pY_eYPXiG3h-lu_zQr4OPplF1XTA/https/i.imgur.com/bofyvTq.png";
		case 1:
			return "https://images-ext-1.discordapp.net/external/l_y5SzeKPGD44KJTYO_peq3lY2hdo_ecv5gRWjSYGIs/https/i.imgur.com/wSbED79.png";
		case 2:
			return "https://images-ext-2.discordapp.net/external/C7640Bi0fkkG0b69SQFuo5Na3krnSKlLT-BJARUwzDU/https/i.imgur.com/fMUSwqh.png";
		case 3:
			return "https://images-ext-1.discordapp.net/external/HwCEIMzEnHsW7KLNDjzd5YEXtQLavs5CGYqRanZ2Jd0/https/i.imgur.com/ubcRlIX.png";
		case 4:
			return "https://images-ext-1.discordapp.net/external/8bF4HoIYQgeDIEGJxEhVMsK6Rk5klBbnK5_ucwBHLVg/https/i.imgur.com/dzEMceP.png";
		case 5:
			return "https://images-ext-2.discordapp.net/external/90s7UKWeEuh_TRuUzfVMQVRnsA8Xe0Ohu0MORT8pJBQ/https/i.imgur.com/yAHIK0o.png";
		case 6:
			return "https://images-ext-1.discordapp.net/external/Y4XtVCe0R-0UE2Ugxzvftr16D_JGFHacDGpaKgnU2H4/https/i.imgur.com/PtuVGp6.png";
		case 7:
			return "https://images-ext-2.discordapp.net/external/Cc9ZBW-JKKhZ2fsOraTDGJwXqyp57ovhsnuwXVeKd8M/https/i.imgur.com/GyXAXs5.png";
		case 8:
			return "https://images-ext-2.discordapp.net/external/Cxcq_dYwDiq2_ZYvLzUNxZ-OsWz5jDMPn8k-qJurwSo/https/i.imgur.com/rNhS3LA.png";
		case 9:	// Detective Pikachu
			return "https://images-ext-2.discordapp.net/external/HCVWba7E0DJPGEWvyPZoCxXGt7drd3pwKCABMWduVwE/https/i.imgur.com/9Sfddti.png";
		case 10: // Bob The Minion
			return "https://media.discordapp.net/attachments/429838928707846165/440781998433370123/448e4a3b9fa8727e34f02b33fb4fd9aa.png?width=300&height=300";
		case 11:
			return "https://images-ext-2.discordapp.net/external/a5mxDUTB55ZGC3gSQOCbbdvO_1gVs3sjM-5d0Oy_xZU/https/i.imgur.com/5N93Ibg.png";
		default:
			return getGodRat;
		}
    }
    
    public static String getPokeName(String url) {
    	switch (url) {
        	case "https://media.discordapp.net/attachments/654176421928894485/658511871401394200/PokecordSpawn.jpg":
        		return "Barbaracle";
        	case "https://media.discordapp.net/attachments/654176421928894485/658520674570207233/PokecordSpawn.jpg":
        		return "Bronzor";
    		case "https://media.discordapp.net/attachments/654176421928894485/658507817220702218/PokecordSpawn.jpg":
    			return "Charmander";
    		case "https://media.discordapp.net/attachments/638697845926658068/658514696495824915/PokecordSpawn.jpg":
    			return "Cherubi";
    		case "https://media.discordapp.net/attachments/654176421928894485/658507732563001364/PokecordSpawn.jpg":
    			return "Chikorita";
    		case "https://media.discordapp.net/attachments/638697845926658068/658511947184209970/PokecordSpawn.jpg":
    			return "Clamperl";
    		case "https://media.discordapp.net/attachments/654176421928894485/658507581274456094/PokecordSpawn.jpg":
    			return "Claydol";
    		case "https://media.discordapp.net/attachments/638697845926658068/658508842291822603/PokecordSpawn.jpg":
    			return "Cubone";
    		case "https://media.discordapp.net/attachments/638697845926658068/658516971150770196/PokecordSpawn.jpg":
    			return "Deerling";
    		case "https://media.discordapp.net/attachments/638697845926658068/658511203445899284/PokecordSpawn.jpg":
    			return "Dewott";
    		case "https://media.discordapp.net/attachments/638697845926658068/658511642702774292/PokecordSpawn.jpg":
    			return "Dugtrio";
    		case "https://media.discordapp.net/attachments/654176421928894485/658510585083854848/PokecordSpawn.jpg":
    			return "Dwebble";
    		case "https://media.discordapp.net/attachments/638697845926658068/658513668325244938/PokecordSpawn.jpg":
    			return "Elgyem";
    		case "https://media.discordapp.net/attachments/638697845926658068/658515306389569566/PokecordSpawn.jpg":
    			return "Frillish";
    		case "https://media.discordapp.net/attachments/638697845926658068/658521291053334538/PokecordSpawn.jpg":
    			return "Gastly";
    		case "https://media.discordapp.net/attachments/638697845926658068/658505952814825483/PokecordSpawn.jpg":
    			return "Goldeen";
    		case "https://media.discordapp.net/attachments/638697845926658068/658517681913200700/PokecordSpawn.jpg":
    			return "Golett";
    		case "https://media.discordapp.net/attachments/654176421928894485/658508689841455135/PokecordSpawn.jpg":
    			return "Hariyama";
    		case "https://media.discordapp.net/attachments/654176421928894485/658513057827520543/PokecordSpawn.jpg":
    			return "Horsea";
    		case "https://media.discordapp.net/attachments/638697845926658068/658513748449034250/PokecordSpawn.jpg":
    			return "Hoothoot";
    		case "https://media.discordapp.net/attachments/638697845926658068/658510505597599765/PokecordSpawn.jpg":
    			return "Hypno";
    		case "https://media.discordapp.net/attachments/638697845926658068/658518437345099813/PokecordSpawn.jpg":
    			return "Joltik";
    		case "https://media.discordapp.net/attachments/654176421928894485/658515331396010004/PokecordSpawn.jpg":
    			return "Karrablast";
    		case "https://media.discordapp.net/attachments/638697845926658068/658506264304812042/PokecordSpawn.jpg":
    			return "Lopunny";
    		case "https://media.discordapp.net/attachments/638697845926658068/658515900344827905/PokecordSpawn.jpg":
    			return "Lotad";
    		case "https://media.discordapp.net/attachments/638697845926658068/658515669112979476/PokecordSpawn.jpg":
    			return "Malamar";
    		case "https://media.discordapp.net/attachments/638697845926658068/658518628722933760/PokecordSpawn.jpg":
    			return "Mawile";
    		case "https://media.discordapp.net/attachments/654176421928894485/658519261328703488/PokecordSpawn.jpg":
    			return "Minccino";
    		case "https://media.discordapp.net/attachments/638697845926658068/658521566556192799/PokecordSpawn.jpg":
    			return "Nincada";
    		case "https://media.discordapp.net/attachments/654176421928894485/658518195682017300/PokecordSpawn.jpg":
    			return "Nuzleaf";
    		case "https://media.discordapp.net/attachments/654176421928894485/658512847843885066/PokecordSpawn.jpg":
    			return "Petilil";
    		case "https://media.discordapp.net/attachments/638697845926658068/658507753983049728/PokecordSpawn.jpg":
    			return "Pidgey";
    		case "https://media.discordapp.net/attachments/654176421928894485/658507952121970698/PokecordSpawn.jpg":
    			return "Pikipek";
    		case "https://media.discordapp.net/attachments/638697845926658068/658512495820144640/PokecordSpawn.jpg":
    			return "Poochyena";
    		case "https://media.discordapp.net/attachments/638697845926658068/658518727872086026/PokecordSpawn.jpg":
    			return "Raichu";
    		case "https://media.discordapp.net/attachments/638697845926658068/658509333847605263/PokecordSpawn.jpg":
    			return "Roselia";
    		case "https://media.discordapp.net/attachments/654176421928894485/658507156248723470/PokecordSpawn.jpg":
    			return "Rufflet";
    		case "https://media.discordapp.net/attachments/638697845926658068/658511453938253834/PokecordSpawn.jpg":
    			return "Sentret";
    		case "https://media.discordapp.net/attachments/638697845926658068/658508569997738032/PokecordSpawn.jpg":
    			return "Skiddo";
    		case "https://media.discordapp.net/attachments/654176421928894485/658516419037757441/PokecordSpawn.jpg":
    			return "Skitty";
    		case "https://media.discordapp.net/attachments/638697845926658068/658511114694426645/PokecordSpawn.jpg":
    			return "Snover";
    		case "https://media.discordapp.net/attachments/654176421928894485/658517437074898944/PokecordSpawn.jpg":
    			return "Spinda";
    		case "https://media.discordapp.net/attachments/638697845926658068/658513449269067797/PokecordSpawn.jpg":
    			return "Starly";
    		case "https://media.discordapp.net/attachments/638697845926658068/658513874068176898/PokecordSpawn.jpg":
    			return "Taillow";
    		case "https://media.discordapp.net/attachments/654176421928894485/658511402012508180/PokecordSpawn.jpg":
    			return "Toxicroak";
    		case "https://media.discordapp.net/attachments/638697845926658068/658515035131215872/PokecordSpawn.jpg":
    			return "Vulpix";
    		case "https://media.discordapp.net/attachments/654176421928894485/658521399631020033/PokecordSpawn.jpg":
    			return "Wurmple";
    		default:
    			return "N�o sei o nome ;-;";
		}
    }
}
