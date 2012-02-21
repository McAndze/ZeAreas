package me.mcandze.plugin.zeareas;

import me.mcandze.plugin.zeareas.marking.SelectionsManager;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class of ZeAreas. 
 * @author andreas
 *
 */
public class ZeAreas extends JavaPlugin{
	private SelectionsManager selectionsManager;
	public static ZeAreas instance = null;

	@Override
	public void onDisable() {
		selectionsManager = null;
		instance = null;
		
	}

	@Override
	public void onEnable() {
		selectionsManager = new SelectionsManager(this);
		instance = this;
	}

	public SelectionsManager getSelectionsManager() {
		return selectionsManager;
	}
}
