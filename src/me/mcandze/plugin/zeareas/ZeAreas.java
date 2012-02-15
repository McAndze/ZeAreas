package me.mcandze.plugin.zeareas;

import me.mcandze.plugin.zeareas.marking.SelectionsManager;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class of ZeAreas. 
 * @author andreas
 *
 */
public class ZeAreas extends JavaPlugin{
	private SelectionsManager markingManager;

	@Override
	public void onDisable() {
		markingManager = null;
		
	}

	@Override
	public void onEnable() {
		markingManager = new SelectionsManager(this);
	}

	public SelectionsManager getMarkingManager() {
		return markingManager;
	}
}
