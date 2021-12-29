package lightninglobby.lightninglobby;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class stopdrop implements Listener {
    @EventHandler
    public void BlockDropItemEvent(PlayerDropItemEvent event){
        if (event.getPlayer().getLocation().getWorld().getName().equals("Minigames_Lobby"))
            event.setCancelled(true);
    }
}
