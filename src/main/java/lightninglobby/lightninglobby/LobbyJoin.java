package lightninglobby.lightninglobby;

import de.simonsator.partyandfriendsgui.listener.ItemsManager;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbyJoin implements Listener {
    @EventHandler
    public void PlayerChangedWorldEvent(PlayerChangedWorldEvent event, JavaPlugin plugin){
        Player player = event.getPlayer();
        PlayerInventory inv = player.getInventory();
        inv.clear();
        if (player.getLocation().getWorld().getName().equals("Minigames_Lobby")){
            ItemStack compass = new ItemStack(Material.COMPASS, 1);
            ItemMeta commeta = compass.getItemMeta();
            commeta.displayName(Component.text("Games").color(NamedTextColor.DARK_BLUE));
            compass.setItemMeta(commeta);
            player.setCanPickupItems(false);
            player.setHealth(20);
            player.setInvisible(false);
            player.setGameMode(GameMode.ADVENTURE);
            inv.setItem(4, compass);
            ItemsManager itemsManager = new de.simonsator.partyandfriendsgui.listener.ItemsManager(plugin);
            final ItemStack head = itemsManager.getHead(player);
            itemsManager.setItems(player, head);
        }
    }
}
