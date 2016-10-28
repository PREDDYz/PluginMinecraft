package de.FFA.Promo;

import me.tomo.listener.JoinListener;

public class Main {
	
	
	
	
	
    //Plugin Aktiviert
	public void onEnable() {
		
		register();
		
	}
	
	//Plugin Deaktkviert  
	public void onDisable(){
		
		
	}
	
	//Commands & Listener Regestrieren
	public void register(){
		getServer().getPluginManager().registerEvents(new JoinListener(),this);
	
	}	
}
