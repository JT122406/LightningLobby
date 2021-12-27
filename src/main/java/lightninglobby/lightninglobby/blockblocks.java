package lightninglobby.lightninglobby;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class blockblocks implements Listener {
    @EventHandler
    public void BlockPlaceEvent(Block placedBlock, BlockState replacedBlockState, Block placedAgainst, ItemStack itemInHand, Player thePlayer, boolean canBuild){
        if (thePlayer.isOP){
            canBuild = true;
        }
        else
        {
            canBuild = false;
        }
    }
}
