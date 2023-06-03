package me.hilden.plugin;

import command.CommandKits;
import command.CommandSpawn;
import command.CommandStats;
import events.EventInKitsMenu;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import other.StatsScoreboard;

public final class Main extends JavaPlugin {
    EventInKitsMenu eventInKitsMenu = new EventInKitsMenu();
    StatsScoreboard eventStatsScoreboard = new StatsScoreboard();

    @Override
    public void onEnable() {
        System.out.println("Plugin is started");

        getCommand("spawn").setExecutor(new CommandSpawn());
        getCommand("kits").setExecutor(new CommandKits());
        getCommand("stats").setExecutor(new CommandStats());

        Bukkit.getPluginManager().registerEvents(eventInKitsMenu, this);
        Bukkit.getPluginManager().registerEvents(eventStatsScoreboard, this);
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin is disabled");

    }
}
