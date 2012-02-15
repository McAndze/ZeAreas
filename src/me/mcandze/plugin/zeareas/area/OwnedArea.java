package me.mcandze.plugin.zeareas.area;
/**
 * An abstract class for allowing areas to be 'owned'.
 * @author andreas
 *
 */
public abstract class OwnedArea {
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
	/**
	 * 
	 * @return false if server does not have an owner, or if owner is instanceof OwnerServer and it is overWritable().
	 */
	public boolean hasOwner(){
		AreaOwner owner = this.getOwner();
		if (owner instanceof OwnerServer){
			OwnerServer server = (OwnerServer)owner;
			if (server.overWritable()){
				return false;
			} else {
				return true;
			}
		}
		if (owner == null){
			return false;
		}
		return true;
	}
}
