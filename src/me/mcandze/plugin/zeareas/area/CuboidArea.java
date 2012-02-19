package me.mcandze.plugin.zeareas.area;

import me.mcandze.plugin.zeareas.util.BlockLocation;
/**
 * An abstract class for cuboids.
 * @author andreas
 *
 */
public interface CuboidArea extends Area{
	/**
	 * Get the corners of this cuboid.
	 * @return
	 */
	public abstract BlockLocation[] getCorners();
}
