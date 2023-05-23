package kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class KitTheAssasin{
    private Inventory invTheAssasin;

    public Inventory getInvTheAssasin() {
        return invTheAssasin;
    }

    public KitTheAssasin() {
        invTheAssasin = Bukkit.createInventory(null, 27, "Лучник");
        KitTheAssasin.kitTheAssasinAddItem(invTheAssasin); // Метод, добавляющий предметы в инвентарь
    }

    public static void kitTheAssasinAddItem(Inventory inventory) {
        ItemStack itemStackSword = new ItemStack(Material.IRON_SWORD);
        ItemMeta itemMetaSword = itemStackSword.getItemMeta();
        itemMetaSword.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
        itemMetaSword.setUnbreakable(true);
        itemStackSword.setItemMeta(itemMetaSword);

        ItemStack itemStackGapple = new ItemStack(Material.GOLDEN_APPLE, 2);

        ItemStack itemStackPotion = new ItemStack(Material.SPLASH_POTION);
        PotionMeta potionMeta = (PotionMeta) itemStackPotion.getItemMeta();
        potionMeta.setDisplayName(ChatColor.DARK_GREEN + "Эффект скорости 1");
        potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0), true);
        itemStackPotion.setItemMeta(potionMeta);

        ItemStack itemStackHelmet = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta itemMetaHelmet = itemStackHelmet.getItemMeta();
        itemMetaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackHelmet.setItemMeta(itemMetaHelmet);

        ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta itemMetaChestplate = itemStackChestplate.getItemMeta();
        itemMetaChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackChestplate.setItemMeta(itemMetaChestplate);
//хуйню которая ищет вещи в инвентаре через contains и надевает а эту залупу удалить нахуй
        ItemStack itemStackLeggins = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta itemMetaLeggins = itemStackLeggins.getItemMeta();
        itemMetaLeggins.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackLeggins.setItemMeta(itemMetaLeggins);

        ItemStack itemStackBoots = new ItemStack(Material.LEATHER_BOOTS);
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
