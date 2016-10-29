package de.FFA.Promo.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Start implements CommandExecutor {

/**
 *            Diese Class startet FFA
 * 		-Check ob alle Ready sind
 *      -Starte
 * 		-Dieser Befehl darf nur ein Operator ausführen!
 * 
**/

	
	//Variablen 
	String prefix = "[§6FFA§r]";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		if(p.isOp() == true ){
			//Starte Plugin
			Bukkit.broadcastMessage(prefix + "Ein Admin hat FFA gestartet!");
			Bukkit.broadcastMessage(prefix + "Schreibe §3!ready§r wenn du §3bereit§r bist!");
			
			
			
			
		}else{
			p.sendMessage(prefix +" §4Du kannst FFA nicht starten!");
		}
		
		
		
		
		return false;
	}

}
