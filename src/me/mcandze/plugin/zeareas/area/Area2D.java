package me.mcandze.plugin.zeareas.area;

import java.util.ArrayList;
import java.util.List;

import me.mcandze.plugin.zeareas.util.BlockLocation;

import org.bukkit.Location;
import org.bukkit.World;

public class Area2D extends CuboidArea{
	private BlockLocation location1, location2;
	private World world;
	private double lowX, lowZ, highX, highZ;
	private AreaOwner owner;
	
	/**
	 * The constructor for an Area2D. Returns null if
	 * @param location1
	 * @param location2
	 */
	public Area2D(Location location1, Location location2){
		this.location1 = BlockLocation.toBlockLocation(location1);
		this.location2 = BlockLocation.toBlockLocation(location2);
		this.world = location1.getWorld();
		this.recalcMinimum();
		this.owner = new OwnerServer();
	}
	
	public Area2D(Location location1, Location location2, AreaOwner owner){
		this(location1, location2);
		this.owner = owner;
	}
	
	@Override
	public List<BlockLocation> getPoints() {
		List<BlockLocation> toReturn = new ArrayList<BlockLocation>();
		toReturn.add(location1);
		toReturn.add(location2);
		return toReturn;
	}

	@Override
	public boolean isLocationInArea(BlockLocation location) {
		double x = location.getX();
		double z = location.getZ();
		return location.getWorld().equals(this.world) && (x > lowX && x < highX &&  z > lowZ && z < highZ);
	}
	
	public void recalcMinimum(){
		lowX = Math.min(location1.getX(), location2.getX());
		lowZ = Math.min(location1.getZ(), location2.getZ());
		
		highX = Math.max(location1.getX(), location2.getX());
		highZ = Math.max(location1.getZ(), location2.getZ());
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	@Override
	public BlockLocation[] getCorners() {
		BlockLocation[] list = new BlockLocation[4];
		list[0] = this.location1;
		list[1] = this.location2;
		list[2] = new BlockLocation(Math.max(list[0].getX(), list[1].getX()), 
				Math.max(list[0].getZ(), list[1].getZ()), 
				list[0].getY(), list[0].getWorld());
		return null;
	}
}
