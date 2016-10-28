package de.FFA.Promo;

import org.bukkit.plugin.java.JavaPlugin;

import de.FFA.Promo.commands.BeispielKlasse;
import de.FFA.Promo.listener.*;

public class Main extends JavaPlugin {
	
	
	
	
	
    //Plugin Aktiviert
	public void onEnable() {
		
		register();
		
	}
	
	//Plugin Deaktkviert  
	public void onDisable(){
		
		
	}
	
	//Commands & Listener Regestrieren
	public void register(){
		
		//Listener
	getServer().getPluginManager().registerEvents(new JoinListener(), this);
	
		//Commands
	getCommand("BeispielKlasse").setExecutor(new BeispielKlasse());
	}	
}
