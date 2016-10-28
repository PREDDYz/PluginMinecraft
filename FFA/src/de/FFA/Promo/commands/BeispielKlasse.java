package de.FFA.Promo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BeispielKlasse implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p =(Player) sender; //p == der Sender des "Commands" 
		
		p.sendMessage("Dies ist ein Beispiel Command!"); //Der spieler erhält eine Message.
		
		return false;
	}

}
