package me.mcandze.plugin.zeareas.area;

import java.util.ArrayList;
import java.util.List;

import me.mcandze.plugin.zeareas.util.BlockLocation;

import org.bukkit.Location;
import org.bukkit.World;

public class RangeArea extends CuboidArea {
	private BlockLocation location;
	private World world;
	private int range;
	
	public RangeArea(Location location, int range){
		this.location = BlockLocation.toBlockLocation(location);
		this.range = range;
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
				+ Math.pow(location.getZ() - test.getZ(), 2)) <= this.getRange());
	}
	
	public int getRange(){
		return this.range;
	}
	
	public void setRange(int range){
		this.range = range;
	}
	
	@Override
	public BlockLocation[] getCorners() {
		BlockLocation[] list = new BlockLocation[4];
		return null;
	}
	
	
}
