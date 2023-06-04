package kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class KitTheAlchemist {
    public static void kitTheAlchemistAddItem(Inventory inventory) {
        ItemStack itemStackSword = new ItemStack(Material.STONE_SWORD);
        ItemMeta itemMetaSword = itemStackSword.getItemMeta();
        itemMetaSword.setUnbreakable(true);
        itemStackSword.setItemMeta(itemMetaSword);

        ItemStack itemStackGapple = new ItemStack(Material.GOLDEN_APPLE, 2);

        ItemStack itemStackPearl = new ItemStack(Material.ENDER_PEARL);

        ItemStack itemStackHelmet = new ItemStack(Material.IRON_HELMET);

        ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);

        ItemStack itemStackLeggins = new ItemStack(Material.IRON_LEGGINGS);

        ItemStack itemStackBoots = new ItemStack(Material.IRON_BOOTS);

        ItemStack potion = new ItemStack(Material.SPLASH_POTION);
        PotionMeta potionMeta = (PotionMeta) potion.getItemMeta();
        potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 0, 0), true);
        potionMeta.setDisplayName(ChatColor.DARK_RED + "Мгновенный урон 1");
        potionMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        potionMeta.setColor(Color.RED);
        potion.setItemMeta(potionMeta);

        ItemStack itemStackBack = new ItemStack(Material.BARRIER);
        ItemMeta itemMetaBack = itemStackBack.getItemMeta();
        itemMetaBack.setDisplayName(ChatColor.LIGHT_PURPLE + "Вернуться назад");
        itemStackBack.setItemMeta(itemMetaBack);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackGapple);
        inventory.addItem(itemStackPearl);
        inventory.addItem(potion);
        inventory.addItem(potion);
        inventory.addItem(potion);
        inventory.addItem(potion);
        inventory.addItem(potion);
        inventory.addItem(potion);
        inventory.setItem(9, itemStackHelmet);
        inventory.setItem(10, itemStackChestplate);
        inventory.setItem(11, itemStackLeggins);
        inventory.setItem(12, itemStackBoots);
        inventory.setItem(26, itemStackBack);

    }
    private Inventory invTheAlchemist; //Создали инвентарь

    public Inventory getInvTheAlchemist() {
        return invTheAlchemist;
    }

    public KitTheAlchemist() {
        invTheAlchemist = Bukkit.createInventory(null, 27, "Лучник");
        KitTheAlchemist.kitTheAlchemistAddItem(invTheAlchemist); // Метод, добавляющий предметы в инвентарь
    }
}
