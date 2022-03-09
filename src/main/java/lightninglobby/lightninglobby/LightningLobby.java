package lightninglobby.lightninglobby;

import java.util.*;

import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class LightningLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Loaded Lightning Minigames Lobby");
        Bukkit.getServer().getPluginManager().registerEvents(new Serverjoin(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new LobbyJoin(), this );
        Bukkit.getServer().getPluginManager().registerEvents(new Lobbynodamage(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new stopdrop(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Playerblockinteract(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new cpgames(), this);
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("gms").setExecutor(new gms());
        getCommand("gma").setExecutor(new gma());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("LightningLobby Disabled");
    }
}
