package de.FFA.Promo.listener;



import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 *            Diese Class überprüft welche Spieler !ready sind
 * 		-Checkt ob die Naricht "!ready" ist
 *      -Starte
 * 		-Dieser Befehl darf jeder ausführen!
 * 
**/



public class ChatListener implements Listener {
	//Erstelle Array list (Kann nur in dieser Klasse aufgerufen werden
	ArrayList<String> readyPlayer = new ArrayList<String>();

	//Variablen
	String prefix = "[§6FFA§r]";
	int ListSize;
	
	
	//p == der Spieler der eine Nachricht geschrieben hat.
	public void onReady(AsyncPlayerChatEvent p){
		//Es wird abgefragt ob die Nachricht "!ready" ist
		if (p.getMessage() == "!ready"){
			
			if( readyPlayer.contains(p.getPlayer().getDisplayName())){
				//Es wird eine message ausgeben das d er Spieler schon !ready ist
				Bukkit.broadcastMessage(prefix +p.getPlayer().getDisplayName()+ "§3 ist schon !ready");
				
			}else{
				//Spieler wird zu "readyPlayer" list hinzugefügt
			readyPlayer.add(p.getPlayer().getDisplayName());
			//ListSize wird Aktualisiert 
			ListSize = readyPlayer.size();
			
			//Wenn Listsize GLEICH oder GRÖßER als 2 ist soll spiel Starten
			if(ListSize >= 2){
				
				
			}
			
			
			
		}
	
		
		
		
	
		
		}
		
	}
}
