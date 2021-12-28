package lightninglobby.lightninglobby;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

public class LobbyJoin implements Listener {
    @EventHandler

    public void PlayerChangedWorldEvent(Player player){
        player.getInventory().clear();
        if (player.getLocation().getWorld().getName().equals("Minigames_Lobby")){
            player.setCanPickupItems(false);
            player.setHealth(40);
            player.setInvisible(false);
            player.setGameMode(GameMode.ADVENTURE);
            player.performCommand("friends gui");
            player.performCommand("cp Games");
        }

    }
}
