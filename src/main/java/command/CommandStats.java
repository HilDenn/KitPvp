package command;

import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CommandStats implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        Player player = (Player) sender;
        int statsKills = player.getStatistic(Statistic.PLAYER_KILLS);
        int statsDeath = player.getStatistic(Statistic.DEATHS);
        player.sendMessage(ChatColor.GOLD + "Убийства: " + statsKills +
                "\nСмерти: " + statsDeath);
        try{
            double statsKD = Math.floor(((double)statsKills / (double)statsDeath) * 100) / 100;
            player.sendMessage(ChatColor.GOLD + "КД: " +  statsKD);
        }catch (ArithmeticException e){
            player.sendMessage(ChatColor.GOLD + "У вас 0 убийств или смертей, невозможно посчитать КД");
        }

        return false;
    }
}
