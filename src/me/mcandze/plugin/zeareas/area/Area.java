package me.mcandze.plugin.zeareas.area;

import java.util.List;

import me.mcandze.plugin.zeareas.util.BlockLocation;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

/**
 * An abstract class for Areas. Should stay relatively small.
 * @author andreas
 *
 */
public interface Area {
	/**
	 * Gets the points that marked this area.
	 * @return
	 */
	public abstract List<BlockLocation> getPoints();
	/**
	 * Checks if a BlockLocation is in area. 
	 * @param location
	 * @return
	 */
	public abstract boolean isLocationInArea(BlockLocation location);
	/**
	 * Checks if a block is in area.
	 * @param block
	 * @return true if Block is in area.
	 */
	public abstract boolean isBlockInArea(Block block);
	/**
	 * Checks if Entity is in area.
	 * @param entity
	 * @return true if Entity is in area.
	 */
	public abstract boolean isEntityInArea(Entity entity);
	/**
	 * Checks if Location is in area.
	 * @param location
	 * @return true if Location is in area.
	 */
	public abstract boolean isLocationInArea(Location location);
}
