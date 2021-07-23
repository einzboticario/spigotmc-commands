package me.einzluis.spigotmccommands;

import me.einzluis.spigotmccommands.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotmcCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("damage").setExecutor(new Damage());
        getCommand("die").setExecutor(new Die());
        getCommand("eat").setExecutor(new Eat());
        getCommand("fly").setExecutor(new Fly());
        getCommand("god").setExecutor(new God());
        getCommand("heal").setExecutor(new Heal());

        // Test
    }

}
