package lightninglobby.lightninglobby

import org.bukkit.command.CommandExecutor
import org.bukkit.entity.Player
import org.bukkit.GameMode
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.ConsoleCommandSender

class gma : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender is Player && sender.hasPermission("gamemode.change")) {
            if (command.name.equals("gms", ignoreCase = true)) {
                if (args.size == 0) {
                    sender.gameMode = GameMode.ADVENTURE
                    sender.sendMessage("Gamemode changed to Adventure")
                    return true
                } else {
                    for (p1 in Bukkit.getOnlinePlayers()) if (p1.name.equals(args[0], ignoreCase = true)) {
                        p1.gameMode = GameMode.ADVENTURE
                        p1.sendMessage("Gamemode changed to Adventure")
                        sender.sendMessage("Updated " + args[0] + "'s gamemode to Adventure")
                        return true
                    }
                    sender.sendMessage("Player doesn't exist")
                }
            }
        } else if (args.size == 1 && sender is ConsoleCommandSender) {
            for (p1 in Bukkit.getOnlinePlayers()) {
                if (p1.name.equals(args[0], ignoreCase = true)) {
                    p1.gameMode = GameMode.ADVENTURE
                    p1.sendMessage("Gamemode changed to Adventure")
                    sender.sendMessage("Updated " + args[0] + "'s gamemode to Adventure")
                    return true
                }
            }
        }
        return true
    }
}