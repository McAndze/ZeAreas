package me.mcandze.plugin.zeareas.area;
/**
 * An interface for allowing areas to be 'owned'.
 * @author andreas
 *
 */
public interface OwnedArea {
	/**
	 * Get the owner of this area. Should check if hasOwner() first.
	 * @return the AreaOwner of this area.
	 */
	public abstract AreaOwner getOwner();
	/**
	 * Sets the owner of this area.
	 * @param owner the AreaOwner to set.
	 */
	public abstract void setOwner(AreaOwner owner);
	
	public abstract boolean hasOwner();
}
