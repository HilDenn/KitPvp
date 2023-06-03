package command;

import me.hilden.plugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;


public class CommandSpawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location loc = new Location(player.getWorld(), 0, 100, 0, 0, 0);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            player.sendMessage(ChatColor.GOLD + "Вы будете телепортированы через 5 секунд!");
            scheduler.runTaskLater(Main.getPlugin(Main.class), () -> {
                player.teleport(loc);
                player.sendMessage(ChatColor.GOLD + "Вы были телепортированы на спавн!");
            }, 100L);



            return false;
        }
        return true;
    }
}
