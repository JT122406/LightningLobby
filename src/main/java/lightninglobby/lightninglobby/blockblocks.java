package lightninglobby.lightninglobby;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.yaml.snakeyaml.events.Event;

public class blockblocks implements Listener {
    @EventHandler
    public void BlockPlaceEvent(Block placedBlock, BlockState replacedBlockState, Block placedAgainst, ItemStack itemInHand, Player thePlayer, boolean canBuild){
        if (thePlayer.getLocation().getWorld().getName().equals("Minigames_Lobby")) {
            if (thePlayer.isOP) {
                canBuild = true;
            } else {
                canBuild = false;
            }
        }

        //Everything else should be handled by the plugin controlling that minigames world
    }
    public class BlockEdits implements Listener {
        @EventHandler
        public void PlayerInteractEvent (Player who, Action action, ItemStack item, Block clickedBlock, BlockFace
        clickedFace){

            if (who.getLocation().getWorld().getName.equals("Minigames_Lobby")) {
                if (clickedBlock.getMaterial(item) == 151) {
                    action.isCancelled(true);

                }
            }
        }
    }

}
