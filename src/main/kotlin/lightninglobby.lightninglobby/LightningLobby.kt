package lightninglobby.lightninglobby

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class LightningLobby : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Bukkit.getServer().logger.info("Loaded Lightning Minigames Lobby")
        Bukkit.getServer().pluginManager.registerEvents(Serverjoin(), this)
        Bukkit.getServer().pluginManager.registerEvents(LobbyJoin(), this)
        Bukkit.getServer().pluginManager.registerEvents(Lobbynodamage(), this)
        Bukkit.getServer().pluginManager.registerEvents(StopDrop(), this)
        Bukkit.getServer().pluginManager.registerEvents(Playerblockinteract(), this)
        Bukkit.getServer().pluginManager.registerEvents(cpgames(), this)
        getCommand("gmc")!!.setExecutor(GamemodeCreative())
        getCommand("gmsp")!!.setExecutor(GamemodeSpectator())
        getCommand("gms")!!.setExecutor(GamemodeSurvival())
        getCommand("gma")!!.setExecutor(GamemodeAdventure())

    }

    override fun onDisable() {
        // Plugin shutdown logic
        Bukkit.getServer().logger.info("LightningLobby Disabled")
    }
}