package me.mcandze.plugin.zeareas.marking;

import java.util.HashMap;

import me.mcandze.plugin.zeareas.ZeAreas;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SelectionsManager implements Listener{
	public static int SELECTION_ITEM = 290;
	private HashMap<String, Selection> seletions;
	private ZeAreas instance;
	
	public SelectionsManager(ZeAreas instance){
		this.instance = instance;
		this.instance.getServer().getPluginManager().registerEvents(this, this.instance);
		this.seletions = new HashMap<String, Selection>();
	}
	
	public Selection getSelection(Player player){
		return getSelection(player.getName());
	}
	
	public Selection getSelection(String string){
		return seletions.get(string);
	}
	
	/*
	 * Listener start
	 */
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerInteract(final PlayerInteractEvent event){
		if (event.isCancelled()){
			return;
		}
		Action action = event.getAction();
		int id = event.getItem().getTypeId();
		
		if (id == SELECTION_ITEM){
			if (action == Action.LEFT_CLICK_BLOCK){
				this.leftClickMark(event);
				event.setCancelled(true);
			} else if (action == Action.RIGHT_CLICK_BLOCK){
				this.rightClickMark(event);
				event.setCancelled(true);
			}
		}
	}
	
	/**
	 * Does not rely on anything so can be called externally.
	 * @param event
	 */
	public void leftClickMark(final PlayerInteractEvent event){
		Player player = event.getPlayer();
		String playerName = player.getName();
		Block clicked = event.getClickedBlock();
		Location lClicked = clicked.getLocation();
		
		Selection marking;
		if (!seletions.containsKey(playerName)){
			marking = new Selection();
		} else {
			marking = seletions.get(playerName);
		}
		marking.setLocation1(lClicked);
		seletions.put(playerName, marking);
	}
	
	/**
	 * Does not rely on anything so can be called externally.
	 * @param event
	 */
	public void rightClickMark(final PlayerInteractEvent event){
		Player player = event.getPlayer();
		String playerName = player.getName();
		Block clicked = event.getClickedBlock();
		Location lClicked = clicked.getLocation();
		
		Selection marking;
		if (!seletions.containsKey(playerName)){
			marking = new Selection();
		} else {
			marking = seletions.get(playerName);
		}
		marking.setLocation2(lClicked);
		seletions.put(playerName, marking);
	}
	
	/*
	 * Listener stop
	 */
}
