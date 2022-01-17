package lightninglobby.lightninglobby;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gmc implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.hasPermission("group." + "server-operator")) {
            if (command.getName().equalsIgnoreCase("gmc")){
                ((Player) sender).setGameMode(GameMode.CREATIVE);
            }
        }
        return true;

    }
}
