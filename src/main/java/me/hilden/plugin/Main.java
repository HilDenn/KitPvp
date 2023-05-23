package me.hilden.plugin;

import command.CommandKits;
import command.CommandSpawn;
import command.CommandStats;
import events.EventInKitsMenu;
import events.EventPlayerPvp;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import other.MySQL;
import other.PlayerMoneys;
import other.StatsScoreboard;

import java.sql.*;

public final class Main extends JavaPlugin {
    EventInKitsMenu eventInKitsMenu = new EventInKitsMenu();
    EventPlayerPvp eventPlayerPvp = new EventPlayerPvp();
    StatsScoreboard eventStatsScoreboard = new StatsScoreboard();
    PlayerMoneys playerMoneys = new PlayerMoneys();

    public MySQL mySql;
    @Override
    public void onEnable() {
        System.out.println("Plugin is started");
        // Plugin startup logic
        getCommand("spawn").setExecutor(new CommandSpawn());
        getCommand("kits").setExecutor(new CommandKits());
        getCommand("stats").setExecutor(new CommandStats());

        Bukkit.getPluginManager().registerEvents(eventInKitsMenu, this);
        Bukkit.getPluginManager().registerEvents(eventPlayerPvp, this);
        Bukkit.getPluginManager().registerEvents(eventStatsScoreboard, this);
        Bukkit.getPluginManager().registerEvents(playerMoneys, this);

        this.mySql = new MySQL();

        try {
            mySql.connect();
            System.out.println("DB connected");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            Bukkit.getLogger().info("Database not connected");
        }
        try {
            mySql.createTable();
        } catch (SQLException e) {
            System.out.println("Table not created in MAIN");
        }

    }



    @Override
    public void onDisable() {
        System.out.println("Plugin is disabled");
        // Plugin shutdown logic

        try {
            mySql.disconnect();
            System.out.println("DB disconnected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
