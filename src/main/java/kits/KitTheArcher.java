package kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KitTheArcher implements Listener {
    public static void kitTheArcherAddItem(Inventory inventory) {
        ItemStack itemStackSword = new ItemStack(Material.STONE_SWORD);
        ItemMeta itemMetaSword = itemStackSword.getItemMeta();
        itemMetaSword.setUnbreakable(true);
        itemStackSword.setItemMeta(itemMetaSword);

        ItemStack itemStackBow = new ItemStack(Material.BOW);
        ItemMeta itemMetaBow = itemStackBow.getItemMeta();
        itemMetaBow.setDisplayName("Лук, нет блин чеснок");
        itemMetaBow.setUnbreakable(true);
        itemStackBow.setItemMeta(itemMetaBow);

        ItemStack itemStackArrow = new ItemStack(Material.ARROW, 16);

        ItemStack itemStackGapple = new ItemStack(Material.GOLDEN_APPLE, 2);

        ItemStack itemStackPearl = new ItemStack(Material.ENDER_PEARL);

        ItemStack itemStackHelmet = new ItemStack(Material.IRON_HELMET);

        ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);

        ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);

        ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);

        ItemStack itemStackBack = new ItemStack(Material.BARRIER);
        ItemMeta itemMetaBack = itemStackBack.getItemMeta();
        itemMetaBack.setDisplayName(ChatColor.LIGHT_PURPLE + "Вернуться назад");
        itemStackBack.setItemMeta(itemMetaBack);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackBow);
        inventory.addItem(itemStackArrow);
        inventory.addItem(itemStackGapple);
        inventory.addItem(itemStackPearl);
        inventory.setItem(9, itemStackHelmet);
        inventory.setItem(10, itemStackChestplate);
        inventory.setItem(11, itemStackLeggins);
        inventory.setItem(12, itemStackBoots);
        inventory.setItem(26, itemStackBack);
    }

    private Inventory invTheArcher; //Создали инвентарь

    public Inventory getInvTheArcher() {
        return invTheArcher;
    }

    public KitTheArcher() {
        invTheArcher = Bukkit.createInventory(null, 27, "Лучник");
        KitTheArcher.kitTheArcherAddItem(invTheArcher); // Метод, добавляющий предметы в инвентарь
    }
}








