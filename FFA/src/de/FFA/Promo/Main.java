package de.FFA.Promo;

import org.bukkit.plugin.java.JavaPlugin;

import de.FFA.Promo.commands.BeispielKlasse;

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
		
	getCommand("BeispielKlasse").setExecutor(new BeispielKlasse());
	}	
}
