package me.mcandze.plugin.zeareas.area;

import org.bukkit.entity.Player;

public class OwnerPlayer implements AreaOwner{
	private String player;
	
	public OwnerPlayer(Player player){
		this.player = player.getName();
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
	
}
