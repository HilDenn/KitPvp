package kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class KitTheElusive {
    private Inventory invTheElusive;

    public Inventory getInvTheElusive() {
        return invTheElusive;
    }

    public KitTheElusive() {
        invTheElusive = Bukkit.createInventory(null, 27, "Лучник");
        KitTheElusive.kitTheElusiveAddItem(invTheElusive); // Метод, добавляющий предметы в инвентарь
    }

    public static void kitTheElusiveAddItem(Inventory inventory) {
        ItemStack itemStackSword = new ItemStack(Material.STONE_SWORD);
        ItemMeta itemMetaSword = itemStackSword.getItemMeta();
        itemMetaSword.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
        itemMetaSword.setUnbreakable(true);
        itemStackSword.setItemMeta(itemMetaSword);

        ItemStack itemStackGapple = new ItemStack(Material.GOLDEN_APPLE, 2);

        ItemStack itemStackPotion = new ItemStack(Material.SPLASH_POTION);
        PotionMeta potionMeta = (PotionMeta) itemStackPotion.getItemMeta();
        potionMeta.setDisplayName(ChatColor.BLUE + "Эффект скорости 2");
        potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 1, 0), true);
        potionMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        potionMeta.setColor(Color.BLUE);
        itemStackPotion.setItemMeta(potionMeta);

        ItemStack potion = new ItemStack(Material.SPLASH_POTION);
        PotionMeta meta = (PotionMeta) potion.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Эффект прыгучести 1");
        meta.addCustomEffect(new PotionEffect(PotionEffectType.JUMP, 0, 0), true);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        meta.setColor(Color.GREEN);
        potion.setItemMeta(meta);

        ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta itemMetaChestplate = itemStackChestplate.getItemMeta();
        itemMetaChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackChestplate.setItemMeta(itemMetaChestplate);

        ItemStack itemStackLeggins = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta itemMetaLeggins = itemStackLeggins.getItemMeta();
        itemMetaLeggins.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        itemStackLeggins.setItemMeta(itemMetaLeggins);

        ItemStack itemStackBack = new ItemStack(Material.BARRIER);
        ItemMeta itemMetaBack = itemStackBack.getItemMeta();
        itemMetaBack.setDisplayName(ChatColor.LIGHT_PURPLE + "Вернуться назад");
        itemStackBack.setItemMeta(itemMetaBack);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackGapple);
        inventory.setItem(9, itemStackChestplate);
        inventory.setItem(10, itemStackLeggins);
        inventory.setItem(18, itemStackPotion);
        inventory.setItem(19, potion);
        inventory.setItem(26, itemStackBack);
    }
}
