package lightninglobby.lightninglobby

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerDropItemEvent

class StopDrop : Listener {
    @EventHandler
    fun blockDropItemEvent(event: PlayerDropItemEvent) {
        if (event.player.location.world.name == "Minigames_Lobby") event.isCancelled = true
    }
}