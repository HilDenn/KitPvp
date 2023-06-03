package kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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

        ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);

        ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);

        ItemStack itemStackBack = new ItemStack(Material.BARRIER);
        ItemMeta itemMetaBack = itemStackBack.getItemMeta();
        itemMetaBack.setDisplayName(ChatColor.LIGHT_PURPLE + "Вернуться назад");
        itemStackBack.setItemMeta(itemMetaBack);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackGapple);
        inventory.addItem(itemStackPearl);
        inventory.setItem(9, itemStackHelmet);
        inventory.setItem(10, itemStackChestplate);
        inventory.setItem(11, itemStackLeggins);
        inventory.setItem(12, itemStackBoots);
        inventory.setItem(26, itemStackBack);

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
