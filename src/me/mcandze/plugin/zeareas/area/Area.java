package me.mcandze.plugin.zeareas.area;

import java.util.List;

import me.mcandze.plugin.zeareas.util.BlockLocation;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

public abstract class Area {
	public abstract List<BlockLocation> getPoints();
	public abstract boolean isLocationInArea(BlockLocation location);
	public boolean isInArea(Block block){
		return this.isLocationInArea(block.getLocation());
	}
	public boolean isInArea(Entity entity){
		return this.isLocationInArea(entity.getLocation());
	}
	public boolean isLocationInArea(Location location){
		return this.isLocationInArea(BlockLocation.toBlockLocation(location));
	}
}
