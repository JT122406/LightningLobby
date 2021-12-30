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

        if (player.getLocation().getWorld().getName().equals("Minigames_Lobby")){
            PlayerInventory inv = player.getInventory();
            inv.clear();
            ItemStack compass = new ItemStack(Material.COMPASS, 1);
            player.setCanPickupItems(false);
            player.setHealth(20);
            player.setInvisible(false);
            player.setGameMode(GameMode.ADVENTURE);

            ItemMeta meta = compass.getItemMeta();
            meta.setLocalizedName("Games");
            inv.setItem(4, compass);

            //player.performCommand("cp Games");
        }

    }
}
