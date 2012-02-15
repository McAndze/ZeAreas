package me.mcandze.plugin.zeareas.util;

import org.bukkit.Location;
import org.bukkit.World;
/**
 * A small replacement class for Location. Used in Areas.
 * @author andreas
 *
 */
public class BlockLocation{
	private int x;
	private int y;
	private int z;
	private World world;
	
	public BlockLocation(){}
	
	public BlockLocation(int x, int y, int z, World world) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.world = world;
	}

	/**
	 * Converts a Location to a BlockLocation.
	 * @param loc Location to convert.
	 * @return converted BlockLocation.
	 */
	public static BlockLocation toBlockLocation(Location loc){
		BlockLocation blockLoc = new BlockLocation();
		blockLoc.setX(loc.getBlockX());
		blockLoc.setY(loc.getBlockY());
		blockLoc.setZ(loc.getBlockZ());
		return blockLoc;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public World getWorld() {
		return world;
	}
	public void setWorld(World world) {
		this.world = world;
	}
}
