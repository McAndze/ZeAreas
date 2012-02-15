package me.mcandze.plugin.zeareas.area;

import org.bukkit.entity.Player;
/**
 * A wrapper for players, to allow them to become owners.
 * @author andreas
 *
 */
public class OwnerPlayer implements AreaOwner{
	/**
	 * Get the name of the owner.
	 */
	private String player;
	
	public OwnerPlayer(Player player){
		this.player = player.getName();
	}
	
	/**
	 * Returns the name of the owner.
	 * @return
	 */
	public String getPlayer() {
		return player;
	}

	/**
	 * Set the owner by name.
	 * @param player
	 */
	public void setPlayer(String player) {
		this.player = player;
	}
	
	
}
