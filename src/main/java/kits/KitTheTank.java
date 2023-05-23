package kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import java.util.HashMap;
import java.util.List;

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
        itemStackPotion.setItemMeta(potionMeta);

        ItemStack itemStackHelmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta itemMetaHelmet = itemStackHelmet.getItemMeta();
        itemMetaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackHelmet.setItemMeta(itemMetaHelmet);

        ItemStack itemStackChestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta itemMetaChestplate = itemStackChestplate.getItemMeta();
        itemMetaChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackChestplate.setItemMeta(itemMetaChestplate);
//хуйню которая ищет вещи в инвентаре через contains и надевает а эту залупу удалить нахуй
        ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta itemMetaLeggins = itemStackLeggins.getItemMeta();
        itemMetaLeggins.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackLeggins.setItemMeta(itemMetaLeggins);

        ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);
        ItemMeta itemMetaBoots = itemStackBoots.getItemMeta();
        itemMetaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackBoots.setItemMeta(itemMetaBoots);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackGapple);
        inventory.addItem(itemStackHelmet);
        inventory.addItem(itemStackChestplate);
        inventory.addItem(itemStackLeggins);
        inventory.addItem(itemStackBoots);
        inventory.addItem(itemStackPotion);
    }
}
