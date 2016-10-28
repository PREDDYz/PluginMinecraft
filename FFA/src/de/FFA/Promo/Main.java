package de.FFA.Promo;

import org.bukkit.plugin.java.JavaPlugin;

import de.FFA.Promo.commands.BeispielKlasse;
import de.FFA.Promo.listener.*;

public class Main extends JavaPlugin {
	
    //Plugin Aktiviert
	public void onEnable() {
		System.out.println("[FFA] Plugin gestartet...");
		register();
		
	}
	
	
	
	//Plugin Deaktkviert  
	public void onDisable(){
		System.out.println("[FFA] Plugin gestoppt...");
		
	}
	
	
	
	//Commands & Listener Regestrieren
	public void register(){
		
	//Listener
	getServer().getPluginManager().registerEvents(new JoinListener(), this);
	
	//Commands
	getCommand("BeispielKlasse").setExecutor(new BeispielKlasse());
	}	
}
