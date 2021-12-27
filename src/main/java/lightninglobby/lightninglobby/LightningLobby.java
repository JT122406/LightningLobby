package lightninglobby.lightninglobby;

import java.util.*;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public final class LightningLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Loaded Lightning Minigames Lobby");
        Bukkit.getServer().getPluginManager().registerEvents(new LobbyJoin(), this );
        Bukkit.getServer().getPluginManager().registerEvents(new Lobbynodamage(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
