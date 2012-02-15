package me.mcandze.plugin.zeareas.marking;

import me.mcandze.plugin.zeareas.area.Area;

import org.bukkit.Location;

public class Marking {
	private Location location1 = null, location2 = null;
	
	public boolean isDone(){
		return location1 != null && location2 != null;
	}
	
	/**
	 * Suitable for areas needing only one Location.
	 * @return null if both locations are null.
	 */
	public Location getLocation(){
		if (location1 != null){
			return location1;
		}
		// Return location2, or null if both locations are null.
		return location2;
	}
	
	public Location getLocation1() {
		return location1;
	}

	public void setLocation1(Location location1) {
		this.location1 = location1;
	}

	public Location getLocation2() {
		return location2;
	}

	public void setLocation2(Location location2) {
		this.location2 = location2;
	}
}
