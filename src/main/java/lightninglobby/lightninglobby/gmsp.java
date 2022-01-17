package lightninglobby.lightninglobby;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gmsp implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.hasPermission("group." + "server-operator")) {
            if (command.getName().equalsIgnoreCase("gmsp")) {
                ((Player) sender).setGameMode(GameMode.SPECTATOR);
                sender.sendMessage("Gamemode Updated to Spectator");
            }
        }
        return true;
    }


}
