package lightninglobby.lightninglobby;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.*;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.bukkit.inventory.*;

public class LobbyJoin implements Listener {
    @EventHandler

    public void PlayerChangedWorldEvent(PlayerChangedWorldEvent event){
        Player player = event.getPlayer();
        PlayerInventory inv = player.getInventory();
        inv.clear();

        if (player.getLocation().getWorld().getName().equals("Minigames_Lobby")){

            ItemStack compass = new ItemStack(Material.COMPASS, 1);
            ItemMeta commeta = compass.getItemMeta();
            commeta.setDisplayName("Games");
            compass.setItemMeta(commeta);
            player.setCanPickupItems(false);
            player.setHealth(20);
            player.setInvisible(false);
            player.setGameMode(GameMode.ADVENTURE);



            inv.setItem(4, compass);


        }

    }
}
