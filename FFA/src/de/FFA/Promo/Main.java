package de.FFA.Promo;



import org.bukkit.plugin.java.JavaPlugin;

import de.FFA.Promo.commands.BeispielKlasse;
import de.FFA.Promo.commands.Start;
import de.FFA.Promo.listener.*;

public class Main extends JavaPlugin {
	
	
	//Variablen
	public boolean isgameready;
	
	
	
    //Plugin Aktiviert
	public void onEnable() {
		System.out.println("[FFA] Plugin wird geladen!...");
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
	getServer().getPluginManager().registerEvents(new ChatListener(), this);
	//Commands
	getCommand("Start").setExecutor(new Start());
	getCommand("BeispielKlasse").setExecutor(new BeispielKlasse());
	}	
}
