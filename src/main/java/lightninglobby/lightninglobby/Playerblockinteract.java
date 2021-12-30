package lightninglobby.lightninglobby;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.*;
import org.bukkit.event.player.PlayerInteractEvent;

public class Playerblockinteract implements Listener {
    @EventHandler

    public void blockinteractions(PlayerInteractEvent event){
        Player player = (Player) event.getPlayer();
        if (player.getWorld().getName().equals("Minigames_Lobby")){
            Material clicked = player.getInventory().getItemInMainHand().getType();
            if (((event.getAction()  == Action.RIGHT_CLICK_AIR) || (Action.RIGHT_CLICK_BLOCK == event.getAction())) && (clicked == Material.COMPASS)){
                Bukkit.getServer().dispatchCommand(player, "cp Games");
            }
            event.setCancelled(true);
            return;
        }



    }
}
