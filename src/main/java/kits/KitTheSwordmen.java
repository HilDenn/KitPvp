package kits;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class KitTheSwordmen implements Listener {

    public static void kitTheSwordmenAddItem(Inventory inventory) {
        ItemStack itemStackSword = new ItemStack(Material.IRON_SWORD);
        ItemMeta itemMetaSword = itemStackSword.getItemMeta();
        itemMetaSword.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
        itemMetaSword.setUnbreakable(true);
        itemStackSword.setItemMeta(itemMetaSword);

        ItemStack itemStackGapple = new ItemStack(Material.GOLDEN_APPLE, 2);

        ItemStack itemStackPearl = new ItemStack(Material.ENDER_PEARL);

        ItemStack itemStackHelmet = new ItemStack(Material.IRON_HELMET);

        ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
//хуйню которая ищет вещи в инвентаре через contains и надевает а эту залупу удалить нахуй
        ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);

        ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackGapple);
        inventory.addItem(itemStackPearl);
        inventory.addItem(itemStackHelmet);
        inventory.addItem(itemStackChestplate);
        inventory.addItem(itemStackLeggins);
        inventory.addItem(itemStackBoots);

    }
    private Inventory invTheSwordmen; //Создали инвентарь
    public Inventory getInvTheSwordmen() {
        return invTheSwordmen;
    }
    public KitTheSwordmen() {
        invTheSwordmen = Bukkit.createInventory(null, 27, "Мечник");
        KitTheSwordmen.kitTheSwordmenAddItem(invTheSwordmen); // Метод, добавляющий предметы в инвентарь
    }
}
