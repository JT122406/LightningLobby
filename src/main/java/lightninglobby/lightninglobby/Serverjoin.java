package lightninglobby.lightninglobby;

import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class Serverjoin implements Listener {
    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        PlayerInventory inv = player.getInventory();
        inv.clear();
        if (player.getLocation().getWorld().getName().equals("Minigames_Lobby")) {
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
