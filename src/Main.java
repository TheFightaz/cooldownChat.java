
package fightaz.cooldown;

import org.bukkit.plugin.java.JavaPlugin;

import fightaz.cooldown.event.onChat;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new onChat(), this);
	}

}
