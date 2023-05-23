package command;

import events.EventPlayerPvp;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CommandSpawn implements CommandExecutor {
    EventPlayerPvp playerPvp = new EventPlayerPvp();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (playerPvp.playersInPvp.contains(player)) {
            player.sendMessage("Ты находишься в режиме пвп!");
            return true;
        }
        else {
            Location loc = new Location(player.getWorld(), 0, 100, 0, 0, 0);
            player.teleport(loc);

            return false;
        }
    }
}
