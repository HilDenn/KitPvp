package kits;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
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
//хуйню которая ищет вещи в инвентаре через contains и надевает а эту залупу удалить нахуй
        ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);

        ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackBow);
        inventory.addItem(itemStackArrow);
        inventory.addItem(itemStackGapple);
        inventory.addItem(itemStackPearl);
        inventory.addItem(itemStackHelmet);
        inventory.addItem(itemStackChestplate);
        inventory.addItem(itemStackLeggins);
        inventory.addItem(itemStackBoots);
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








