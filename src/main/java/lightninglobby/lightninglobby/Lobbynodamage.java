package lightninglobby.lightninglobby;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Lobbynodamage implements Listener {
    @EventHandler

    public void onPlayerDamage(EntityDamageEvent e){
        if (e.getEntity() instanceof Player && e.getEntity().getWorld().getName().equals("Minigames_Lobby")){
            e.setCancelled(true);
        }
        return;
    }
}
