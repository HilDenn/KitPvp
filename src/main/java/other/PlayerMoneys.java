package other;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.UUID;

public class PlayerMoneys implements Listener {
    MySQL mySQL = new MySQL();
    private final int moneyForKills = 15;

    @EventHandler
    public void onJoinPlayer(PlayerJoinEvent event) throws SQLException {
        UUID playerUUID = event.getPlayer().getUniqueId();

        if (mySQL.isPlayerInDb(playerUUID.toString())) {



        }
    }

    @EventHandler
    public void onKillsPlayer(PlayerDeathEvent event) {
        UUID killerUUID = event.getEntity().getKiller().getUniqueId();
        UUID deadUUID = event.getEntity().getUniqueId();
        Player dead = event.getEntity();
        Player killer = event.getEntity().getKiller();


    }
}
