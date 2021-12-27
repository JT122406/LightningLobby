package lightninglobby.lightninglobby;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.*;
public class LobbyJoin implements Listener {
    @EventHandler

    public void onWorldJoin(PlayerMoveEvent event){
      if (event.getPlayer().getLocation().getWorld().getName().equals("Minigames_Lobby")){
          player.performcommand("friends gui");
      }
    }
}
