package command;

import events.EventPlayerPvp;
import kits.KitsMenu;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CommandKits extends KitsMenu implements CommandExecutor{
    EventPlayerPvp playerPvp = new EventPlayerPvp();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.getLocation().getY() < 90 || playerPvp.playersInPvp.contains(player)){
            player.sendMessage(ChatColor.RED + "Меню наборов можно открывать только на спавне!");
            return true;
        }
        else {
            player.openInventory(getKitMenuInventory());
            return false;
        }
    }
}
