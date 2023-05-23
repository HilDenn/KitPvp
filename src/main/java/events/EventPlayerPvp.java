package events;

import me.hilden.plugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.net.http.common.Utils.close;

public class EventPlayerPvp implements Listener {
    public List<Player> playersInPvp = new ArrayList<>();
    private int seconds = 15;

    @EventHandler
    public void playerPvp(EntityDamageByEntityEvent event){
        Player damager = (Player) event.getDamager();
        Player getDamage = (Player) event.getEntity();
        if(damager instanceof Player && getDamage instanceof Player) {
            playersInPvp.add(damager);
            playersInPvp.add(getDamage);
            BossBar bar = Bukkit.getServer().createBossBar("Кулдаун", BarColor.BLUE,
                    BarStyle.SOLID, BarFlag.CREATE_FOG);
            bar.setVisible(true);
            bar.addPlayer(damager);
            bar.addPlayer(getDamage);

            Thread thread = new Thread() {
                @Override
                public void run() {
                    final int[] ctr = {seconds};
                    while (ctr[0] >= 0) {
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                ctr[0]--;
                                damager.sendMessage("Кулдаун - " + ctr[0]);
                                getDamage.sendMessage("Кулдаун - " + ctr[0]);
                                bar.setTitle("Кулдаун - " + ctr[0]);
                                if (ctr[0] <= 0) {
                                    playersInPvp.remove(damager);
                                    playersInPvp.remove(getDamage);
                                    bar.removePlayer(damager);
                                    bar.removePlayer(getDamage);
                                    cancel();
                                    close();
                                    //  Bukkit.getScheduler().cancelTask();
                                }
                            }
                        }.runTask(Main.getPlugin(Main.class));
                    }
                }
            };
            thread.start();
        }


//        BukkitRunnable runnable = new BukkitRunnable(){
//            @Override
//            public void run(){
//                seconds--;
//                damager.sendMessage("Кулдаун - " + seconds);
//                getDamage.sendMessage("Кулдаун - " + seconds);
//                if(seconds <= 0){
//                    playersInPvp.remove(damager);
//                    playersInPvp.remove(getDamage);
//                    cancel();
//                }
//            }
//        };
//        runnable.runTaskTimerAsynchronously((Plugin) this, 0L, 20L);

    }
}
