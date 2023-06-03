package kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class KitTheTank implements Listener {
    private Inventory invTheTank;

    public Inventory getInvTheTank() {
        return invTheTank;
    }

    public KitTheTank() {
        invTheTank = Bukkit.createInventory(null, 27, "Лучник");
        KitTheTank.kitTheTankAddItem(invTheTank); // Метод, добавляющий предметы в инвентарь
    }

    public static void kitTheTankAddItem(Inventory inventory) {
        ItemStack itemStackSword = new ItemStack(Material.WOOD_SWORD);
        ItemMeta itemMetaSword = itemStackSword.getItemMeta();
        itemMetaSword.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
        itemMetaSword.setUnbreakable(true);
        itemStackSword.setItemMeta(itemMetaSword);

        ItemStack itemStackGapple = new ItemStack(Material.GOLDEN_APPLE, 4);

        ItemStack itemStackPotion = new ItemStack(Material.SPLASH_POTION);
        PotionMeta potionMeta = (PotionMeta) itemStackPotion.getItemMeta();
        potionMeta.setDisplayName(ChatColor.DARK_GREEN + "Эффект медлительности 2");
        potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 0, 1), true);
        potionMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        potionMeta.setColor(Color.FUCHSIA);
        itemStackPotion.setItemMeta(potionMeta);

        ItemStack itemStackHelmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta itemMetaHelmet = itemStackHelmet.getItemMeta();
        itemMetaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackHelmet.setItemMeta(itemMetaHelmet);

        ItemStack itemStackChestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta itemMetaChestplate = itemStackChestplate.getItemMeta();
        itemMetaChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackChestplate.setItemMeta(itemMetaChestplate);

        ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta itemMetaLeggins = itemStackLeggins.getItemMeta();
        itemMetaLeggins.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackLeggins.setItemMeta(itemMetaLeggins);

        ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);
        ItemMeta itemMetaBoots = itemStackBoots.getItemMeta();
        itemMetaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackBoots.setItemMeta(itemMetaBoots);

        ItemStack itemStackBack = new ItemStack(Material.BARRIER);
        ItemMeta itemMetaBack = itemStackBack.getItemMeta();
        itemMetaBack.setDisplayName(ChatColor.LIGHT_PURPLE + "Вернуться назад");
        itemStackBack.setItemMeta(itemMetaBack);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackGapple);
        inventory.setItem(9, itemStackHelmet);
        inventory.setItem(10, itemStackChestplate);
        inventory.setItem(11, itemStackLeggins);
        inventory.setItem(12, itemStackBoots);
        inventory.setItem(18, itemStackPotion);
        inventory.setItem(26, itemStackBack);
    }
}
