package me.mcandze.plugin.zeareas.area;

/**
 * Will just use the 'server' as an owner, as if the area didn't have an owner.
 * @author andreas
 *
 */
public class OwnerServer implements AreaOwner{
	private boolean overWritable;
	/**
	 * You should generally not set any new owner of an area,
	 * if a OwnerServer that is not overwritable owns the area.
	 * @return
	 */
	public boolean overWritable(){
		return this.overWritable;
	}
	/**
	 * Set if overwritable.
	 * @param b
	 */
	public void setOverWritable(boolean b){
		this.overWritable = b;
	}
}
