package me.mcandze.plugin.zeareas.area;

public abstract class OwnedArea {
	public abstract AreaOwner getOwner();
	public abstract void setOwner(AreaOwner owner);
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
