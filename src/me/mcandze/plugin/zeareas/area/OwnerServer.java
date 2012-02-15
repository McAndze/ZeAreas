package me.mcandze.plugin.zeareas.area;

/**
 * Will just use the 'server' as an owner, as if the area didn't have an owner.
 * @author andreas
 *
 */
public class OwnerServer implements AreaOwner{
	private boolean overWritable;
	public boolean overWritable(){
		return this.overWritable;
	}
	public void setOverWritable(boolean b){
		this.overWritable = b;
	}
}
