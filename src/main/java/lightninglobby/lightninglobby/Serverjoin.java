package lightninglobby.lightninglobby;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public class Serverjoin implements Listener {
    @EventHandler
    public void PlayerJoinEvent(Player player) {
        player.getInventory().clear();
        if (player.getLocation().getWorld().getName().equals("Minigames_Lobby")) {
            player.setCanPickupItems(false);
            player.setHealth(40);
            player.setInvisible(false);
            player.setGameMode(GameMode.ADVENTURE);
            player.performCommand("friends gui");
        }
    }
}
