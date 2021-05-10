package fightaz.cooldown.event;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class onChat implements Listener {
	
	HashMap<Player, Long> spam = new HashMap<Player, Long>();
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
		if(!p.hasPermission("fightaz.cd")) {
			if(spam.containsKey(p)) {
				if(spam.get(p)> System.currentTimeMillis()){
					p.sendMessage("§7Musisz poczekać §e3 sekundy§7, zanim napiszesz kolejną wiadmość!");
					e.setCancelled(true);
		}	else {
			  //Wiadomosci gracza
			  spam.put(p, System.currentTimeMillis() + 3000);
		}
		} else {
			//Wiadomosci gracza
			spam.put(p, System.currentTimeMillis() + 3000);
		}
	}

}
}
