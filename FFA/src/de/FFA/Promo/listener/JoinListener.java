package de.FFA.Promo.listener;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


import me.tomo.utils.Item;


public class JoinListener implements Listener{
	Location LocationNewsPlayer ;
	Item item = new Item();
	@EventHandler
	public void onJoin(PlayerJoinEvent p){
		
		
		p.getPlayer().setHealthScale(20);
		p.getPlayer().getInventory().clear();
		LocationNewsPlayer = p.getPlayer().getWorld().getSpawnLocation();
		p.getPlayer().setBedSpawnLocation(LocationNewsPlayer);
		p.getPlayer().getInventory().setItem(4, item.createItem(Material.COMPASS, "§bMenü"));
		p.getPlayer().getInventory().setHelmet(item.createItem(Material.JACK_O_LANTERN, "§6Kürbis"));
		
		
	
		
		
		
	}
}
