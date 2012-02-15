package me.mcandze.plugin.zeareas.area;

import java.util.ArrayList;
import java.util.List;

import me.mcandze.plugin.zeareas.util.BlockLocation;

import org.bukkit.Location;
import org.bukkit.World;

/**
 * A range based area. It has only got one point, and acts in a certain radius around this point.
 * @author andreas
 *
 */
public class RangeArea extends CuboidArea {
	private BlockLocation location;
	private World world;
	private int radius;
	
	public RangeArea(Location location, int radius){
		this.location = BlockLocation.toBlockLocation(location);
		this.radius = radius;
		this.world = location.getWorld();
	}
	@Override
	public List<BlockLocation> getPoints() {
		List<BlockLocation> toReturn = new ArrayList<BlockLocation>();
		toReturn.add(location);
		return toReturn;
	}

	@Override
	public boolean isLocationInArea(BlockLocation test) {
		return test.getWorld().equals(this.world) && (Math.sqrt(Math.pow(location.getX() - test.getX(), 2)
				+ Math.pow(location.getY() - test.getY(), 2)
				+ Math.pow(location.getZ() - test.getZ(), 2)) <= this.getRadius());
	}
	
	/**
	 * Return the radius of this area.
	 * @return
	 */
	public int getRadius(){
		return this.radius;
	}
	
	/**
	 * Sets the radius of this area.
	 * @param radius
	 */
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	@Override
	public BlockLocation[] getCorners() {
		BlockLocation[] list = new BlockLocation[4];
		return null;
	}
	
	
}
