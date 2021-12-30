package lightninglobby.lightninglobby;

import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

public class cpgames implements Listener {
    @EventHandler

    public void clickgame(InventoryClickEvent event){
        Player p = (Player) event.getWhoClicked();
        if (p.getLocation().getWorld().getName().equals("Minigames_Lobby")  && (event.getCurrentItem().getType() == Material.COMPASS)){
            Bukkit.getServer().dispatchCommand(p, "cp Games");
        }
    }
}
