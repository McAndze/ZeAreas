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

public class MarkingManager implements Listener{
	public static int MARKING_ITEM = 290;
	private HashMap<String, Marking> markingMap;
	private ZeAreas instance;
	
	public MarkingManager(ZeAreas instance){
		this.instance = instance;
		this.instance.getServer().getPluginManager().registerEvents(this, this.instance);
		this.markingMap = new HashMap<String, Marking>();
	}
	
	public Marking getMarking(Player player){
		return getMarking(player.getName());
	}
	
	public Marking getMarking(String string){
		return markingMap.get(string);
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
		
		if (id == MARKING_ITEM){
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
		
		Marking marking;
		if (!markingMap.containsKey(playerName)){
			marking = new Marking();
		} else {
			marking = markingMap.get(playerName);
		}
		marking.setLocation1(lClicked);
		markingMap.put(playerName, marking);
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
		
		Marking marking;
		if (!markingMap.containsKey(playerName)){
			marking = new Marking();
		} else {
			marking = markingMap.get(playerName);
		}
		marking.setLocation2(lClicked);
		markingMap.put(playerName, marking);
	}
	
	/*
	 * Listener stop
	 */
}
