package me.mcandze.plugin.zeareas;

import me.mcandze.plugin.zeareas.marking.MarkingManager;

import org.bukkit.plugin.java.JavaPlugin;

public class ZeAreas extends JavaPlugin{
	private MarkingManager markingManager;

	@Override
	public void onDisable() {
		markingManager = null;
		
	}

	@Override
	public void onEnable() {
		markingManager = new MarkingManager(this);
	}

	public MarkingManager getMarkingManager() {
		return markingManager;
	}
}
