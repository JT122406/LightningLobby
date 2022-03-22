package lightninglobby.lightninglobby

import org.bukkit.command.CommandExecutor
import org.bukkit.entity.Player
import org.bukkit.GameMode
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.ConsoleCommandSender

class gmc : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender is Player && sender.hasPermission("gamemode.change")) {
            if (command.name.equals("gms", ignoreCase = true)) {
                if (args.size == 0) {
                    sender.gameMode = GameMode.CREATIVE
                    sender.sendMessage("Gamemode changed to Creative")
                    return true
                } else {
                    for (p1 in Bukkit.getOnlinePlayers()) if (p1.name.equals(args[0], ignoreCase = true)) {
                        p1.gameMode = GameMode.CREATIVE
                        p1.sendMessage("Gamemode changed to Creative")
                        sender.sendMessage("Updated " + args[0] + "'s gamemode to Creative")
                        return true
                    }
                    sender.sendMessage("Player doesn't exist")
                }
            }
        } else if (args.size == 1 && sender is ConsoleCommandSender) {
            for (p1 in Bukkit.getOnlinePlayers()) {
                if (p1.name.equals(args[0], ignoreCase = true)) {
                    p1.gameMode = GameMode.CREATIVE
                    p1.sendMessage("Gamemode changed to Creative")
                    sender.sendMessage("Updated " + args[0] + "'s gamemode to Creative")
                    return true
                }
            }
        }
        return true
    }
}