package de.FFA.Promo.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Item {

	public ItemStack createItem(Material mat,String displayname){
		
		ItemStack item = new ItemStack(mat);
		ItemMeta mitem = item.getItemMeta();
		mitem.setDisplayName(displayname);
		item.setItemMeta(mitem);
		
		return item;
	}

	
}
