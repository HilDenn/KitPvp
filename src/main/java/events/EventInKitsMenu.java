package events;

import kits.*;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class EventInKitsMenu implements Listener {
    KitsMenu kitsMenu = new KitsMenu();
    KitTheArcher kitTheArcher = new KitTheArcher();
    KitTheSwordmen kitTheSwordmen = new KitTheSwordmen();
    @EventHandler
    public void onLeftClickInInventory(InventoryClickEvent event) {
        ItemStack air = new ItemStack(Material.AIR);
        Player player = (Player) event.getWhoClicked();
        Inventory playerInventory = player.getInventory();
        if (event.getView().getTitle().equals("Меню китов")) {
            event.setCancelled(true);
            if (event.getClick().isLeftClick()) {
                player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20);
                player.setHealth(20);
                for(PotionEffect effect : player.getActivePotionEffects()){
                    player.removePotionEffect(effect.getType());
                }
                event.setCancelled(true);
                if (event.getSlot() == 0) {
                    player.getInventory().clear();
                    KitTheArcher.kitTheArcherAddItem(playerInventory);
                    player.sendMessage("Вы выбрали класс лучника!");
                    playerInventory.setItem(5, air);
                    playerInventory.setItem(6, air);
                    playerInventory.setItem(7, air);
                    playerInventory.setItem(8, air);

                    ItemStack itemStackHelmet = new ItemStack(Material.IRON_HELMET);
                    ItemMeta itemMetaHelmet = itemStackHelmet.getItemMeta();
                    itemMetaHelmet.setUnbreakable(true);
                    itemStackHelmet.setItemMeta(itemMetaHelmet);
                    player.getEquipment().setHelmet(itemStackHelmet);

                    ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemMeta itemMetaChestplate = itemStackChestplate.getItemMeta();
                    itemMetaChestplate.setUnbreakable(true);
                    itemStackChestplate.setItemMeta(itemMetaChestplate);
                    player.getEquipment().setChestplate(itemStackChestplate);

                    ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);
                    ItemMeta itemMetaLeggins = itemStackLeggins.getItemMeta();
                    itemMetaLeggins.setUnbreakable(true);
                    itemStackLeggins.setItemMeta(itemMetaLeggins);
                    player.getEquipment().setLeggings(itemStackLeggins);

                    ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);
                    ItemMeta itemMetaBoots = itemStackBoots.getItemMeta();
                    itemMetaBoots.setUnbreakable(true);
                    itemStackBoots.setItemMeta(itemMetaBoots);
                    player.getEquipment().setBoots(itemStackBoots);

                } else if (event.getSlot() == 1) {
                    player.getInventory().clear();
                    KitTheSwordmen.kitTheSwordmenAddItem(playerInventory);
                    player.sendMessage("Вы выбрали класс мечника!");
                    playerInventory.setItem(3, air);
                    playerInventory.setItem(4, air);
                    playerInventory.setItem(5, air);
                    playerInventory.setItem(6, air);

                    ItemStack itemStackHelmet = new ItemStack(Material.IRON_HELMET);
                    ItemMeta itemMetaHelmet = itemStackHelmet.getItemMeta();
                    itemMetaHelmet.setUnbreakable(true);
                    itemStackHelmet.setItemMeta(itemMetaHelmet);
                    player.getEquipment().setHelmet(itemStackHelmet);

                    ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemMeta itemMetaChestplate = itemStackChestplate.getItemMeta();
                    itemMetaChestplate.setUnbreakable(true);
                    itemStackChestplate.setItemMeta(itemMetaChestplate);
                    player.getEquipment().setChestplate(itemStackChestplate);

                    ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);
                    ItemMeta itemMetaLeggins = itemStackLeggins.getItemMeta();
                    itemMetaLeggins.setUnbreakable(true);
                    itemStackLeggins.setItemMeta(itemMetaLeggins);
                    player.getEquipment().setLeggings(itemStackLeggins);

                    ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);
                    ItemMeta itemMetaBoots = itemStackBoots.getItemMeta();
                    itemMetaBoots.setUnbreakable(true);
                    itemStackBoots.setItemMeta(itemMetaBoots);
                    player.getEquipment().setBoots(itemStackBoots);

                } else if(event.getSlot() == 2){
                    player.getInventory().clear();
                    KitTheTank.kitTheTankAddItem(playerInventory);
                    player.sendMessage("Вы выбрали класс танка!");
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 360000, 1));
                    playerInventory.remove(Material.SPLASH_POTION);
                    playerInventory.setItem(2, air);
                    playerInventory.setItem(3, air);
                    playerInventory.setItem(4, air);
                    playerInventory.setItem(5, air);

                    ItemStack itemStackHelmet = new ItemStack(Material.IRON_HELMET);
                    ItemMeta itemMetaHelmet = itemStackHelmet.getItemMeta();
                    itemMetaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                    itemMetaHelmet.setUnbreakable(true);
                    itemStackHelmet.setItemMeta(itemMetaHelmet);
                    player.getEquipment().setHelmet(itemStackHelmet);

                    ItemStack itemStackChestplate = new ItemStack(Material.IRON_CHESTPLATE);
                    ItemMeta itemMetaChestplate = itemStackChestplate.getItemMeta();
                    itemMetaChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                    itemMetaChestplate.setUnbreakable(true);
                    itemStackChestplate.setItemMeta(itemMetaChestplate);
                    player.getEquipment().setChestplate(itemStackChestplate);
//хуйню которая ищет вещи в инвентаре через contains и надевает а эту залупу удалить нахуй
                    ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);
                    ItemMeta itemMetaLeggins = itemStackLeggins.getItemMeta();
                    itemMetaLeggins.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                    itemMetaLeggins.setUnbreakable(true);
                    itemStackLeggins.setItemMeta(itemMetaLeggins);
                    player.getEquipment().setLeggings(itemStackLeggins);

                    ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);
                    ItemMeta itemMetaBoots = itemStackBoots.getItemMeta();
                    itemMetaBoots.setUnbreakable(true);
                    itemMetaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                    itemStackBoots.setItemMeta(itemMetaBoots);
                    player.getEquipment().setBoots(itemStackBoots);
                } else if(event.getSlot() == 3){
                    player.getInventory().clear();
                    KitTheAssasin.kitTheAssasinAddItem(playerInventory);
                    player.sendMessage("Вы выбрали класс ассасина!");
                    player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(15);
                    player.setHealth(15);
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 360000, 0));
                    playerInventory.remove(Material.SPLASH_POTION);
                    playerInventory.setItem(2, air);
                    playerInventory.setItem(3, air);
                    playerInventory.setItem(4, air);
                    playerInventory.setItem(5, air);

                    ItemStack itemStackHelmet = new ItemStack(Material.LEATHER_HELMET);
                    ItemMeta itemMetaHelmet = itemStackHelmet.getItemMeta();
                    itemMetaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                    itemMetaHelmet.setUnbreakable(true);
                    itemStackHelmet.setItemMeta(itemMetaHelmet);
                    player.getEquipment().setHelmet(itemStackHelmet);

                    ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemMeta itemMetaChestplate = itemStackChestplate.getItemMeta();
                    itemMetaChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                    itemMetaChestplate.setUnbreakable(true);
                    itemStackChestplate.setItemMeta(itemMetaChestplate);
                    player.getEquipment().setChestplate(itemStackChestplate);
//хуйню которая ищет вещи в инвентаре через contains и надевает а эту залупу удалить нахуй
                    ItemStack itemStackLeggins = new ItemStack(Material.LEATHER_LEGGINGS);
                    ItemMeta itemMetaLeggins = itemStackLeggins.getItemMeta();
                    itemMetaLeggins.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                    itemMetaLeggins.setUnbreakable(true);
                    itemStackLeggins.setItemMeta(itemMetaLeggins);
                    player.getEquipment().setLeggings(itemStackLeggins);

                    ItemStack itemStackBoots = new ItemStack(Material.LEATHER_BOOTS);
                    ItemMeta itemMetaBoots = itemStackBoots.getItemMeta();
                    itemMetaBoots.setUnbreakable(true);
                    itemMetaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                    itemStackBoots.setItemMeta(itemMetaBoots);
                    player.getEquipment().setBoots(itemStackBoots);
                }
            }
        }
    }
    @EventHandler
    public void onRightClickInInventory(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equals("Меню китов")) {
            event.setCancelled(true);
            if (event.getClick().isRightClick()) {
                event.setCancelled(true);
                if (event.getSlot() == 0) {
                    KitTheArcher kit = new KitTheArcher();
                    player.openInventory(kit.getInvTheArcher());
                    event.setCancelled(true);
                } else if (event.getSlot() == 1) {
                    KitTheSwordmen kit = new KitTheSwordmen();
                    player.openInventory(kit.getInvTheSwordmen());
                    event.setCancelled(true);
                } else if (event.getSlot() == 2 ){
                    KitTheTank kit = new KitTheTank();
                    player.openInventory(kit.getInvTheTank());
                    event.setCancelled(true);
                } else if (event.getSlot() == 3){
                    KitTheAssasin kit = new KitTheAssasin();
                    player.openInventory(kit.getInvTheAssasin());
                    event.setCancelled(true);
                }
            }
        }
    }

    @EventHandler
    public void onClickInKits(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("Лучник") ||
                event.getView().getTitle().equals("Мечник")) {
            event.setCancelled(true);
            if (event.getClick().isLeftClick() || event.getClick().isRightClick()) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void blockBreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        if(!(player.isOp())){
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Не ломай блок, иди пвпшься!");
        }
    }

    @EventHandler
    public void blockPlace(BlockPlaceEvent event){
        Player player = event.getPlayer();
        if(!(player.isOp())){
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Откуда у тебя блоки?");
        }
    }

    @EventHandler
    public void infinityEat(FoodLevelChangeEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void dropItem(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        event.setCancelled(true);
        player.sendMessage(ChatColor.DARK_RED + "Я тебе запрещаю выбрасывать предметы");
    }

    @EventHandler
    public void deathDropItem(EntityDeathEvent event) {
        event.getDrops().clear();
    }
    //скорборд сделать хуй пойми как с инвентами на смерть и собстна убийство и чтоб вещи не выпадали при смерти

}