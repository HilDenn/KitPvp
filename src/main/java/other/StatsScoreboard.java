package other;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class StatsScoreboard implements Listener {

    PlayerMoneys playerMoneys = new PlayerMoneys();
    public void reloadScoredoard(Player player){
    ScoreboardManager manager = Bukkit.getScoreboardManager();
    Scoreboard board = manager.getNewScoreboard();

    Objective objective = board.registerNewObjective("test", "dummy");
    //Setting where to display the scoreboard/objective (either SIDEBAR, PLAYER_LIST or BELOW_NAME)
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

//Setting the display name of the scoreboard/objective
        objective.setDisplayName(ChatColor.GOLD + "Статистика");

    Score scoreNull = objective.getScore("");
        scoreNull.setScore(5);

    Score scoreKills = objective.getScore(ChatColor.GREEN + "Убийства: " + playerKills(player)); //Get a fake offline player
        scoreKills.setScore(4);

    Score scoreDeath = objective.getScore(ChatColor.RED + "Смерти: " + playerDeaths(player));
        scoreDeath.setScore(3);

        try {
        double statsKD = Math.floor(((double) playerKills(player) / (double) playerDeaths(player)) * 100) / 100;
        Score kd = objective.getScore(ChatColor.BLUE + "КД: " + statsKD);
        kd.setScore(2);
    } catch (ArithmeticException e) {
        Score kdNull = objective.getScore(ChatColor.BLUE + "У вас 0 убйиств или смертей, невозможно посчитать КД");
        kdNull.setScore(2);
    }
        Score scoreMoney = objective.getScore(ChatColor.GOLD + "Монеты: " + playerMoneys.moneyPlayer.get(player.getUniqueId()));
        scoreMoney.setScore(1);

        player.setScoreboard(board);
}
    public int playerKills(Player player){
        return player.getStatistic(Statistic.PLAYER_KILLS);
    }
    public int playerDeaths(Player player){
        return player.getStatistic(Statistic.DEATHS);
    }

    @EventHandler
    public void statsScoreboard(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        reloadScoredoard(player);
    }


    @EventHandler
    public void updateScoreboards(PlayerDeathEvent event){
        Player killer = event.getEntity().getKiller();
        Player dead = event.getEntity();
        dead.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
        reloadScoredoard(dead);
        killer.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
        reloadScoredoard(killer);
    }

//        ScoreboardManager manager = Bukkit.getScoreboardManager();
//        Scoreboard scoreboard = manager.getNewScoreboard();
//        Team team = scoreboard.registerNewTeam("Статистика");
//        Objective objective = scoreboard.registerNewObjective("Убийства - " + playerKills, "da");
//        Score score = objective.getScore(ChatColor.GREEN + "Kills:"); //Get a fake offline player
//        score.setScore(1);
//        player.setScoreboard(scoreboard);
////        Scoreboard scoreboard = player.getScoreboard();
//        player.addScoreboardTag(ChatColor.BLUE + "Убийства: " + playerKills);
//        player.addScoreboardTag(ChatColor.BLUE + "Смерти: " + playerDeaths);
//        player.setScoreboard(scoreboard);
}
