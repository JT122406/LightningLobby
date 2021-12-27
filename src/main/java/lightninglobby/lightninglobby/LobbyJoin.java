package lightninglobby.lightninglobby;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.*;
import org.jetbrains.annotations.NotNull;

public class LobbyJoin implements Listener {
    @EventHandler

    public void PlayerChangedWorldEvent(@NotNull Player player, @NotNull World from){
        player.getInventory().clear();
        if (player.getLocation().getWorld().getName().equals("Minigames_Lobby")){
            player.setCanPickupItems(false);
            player.setHealth(20);

            player.setInvisible(false);
            player.setGameMode(GameMode.ADVENTURE);
        }
    }
}
