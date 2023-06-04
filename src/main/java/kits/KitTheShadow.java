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

public class KitTheShadow {

    public static void kitTheShadowAddItem(Inventory inventory) {
        ItemStack itemStackSword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMetaSword = itemStackSword.getItemMeta();
        itemMetaSword.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
        itemMetaSword.setUnbreakable(true);
        itemStackSword.setItemMeta(itemMetaSword);

        ItemStack itemStackGapple = new ItemStack(Material.GOLDEN_APPLE, 2);

        ItemStack itemStackPearl = new ItemStack(Material.ENDER_PEARL, 2);

        ItemStack potionSpeed = new ItemStack(Material.SPLASH_POTION);
        PotionMeta potionMetaSpeed = (PotionMeta) potionSpeed.getItemMeta();
        potionMetaSpeed.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0), true);
        potionMetaSpeed.setDisplayName(ChatColor.BLUE + "Эффект скорости 1");
        potionMetaSpeed.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        potionMetaSpeed.setColor(Color.BLUE);
        potionSpeed.setItemMeta(potionMetaSpeed);

        ItemStack potionInvisible = new ItemStack(Material.SPLASH_POTION);
        PotionMeta potionMetaInvisible = (PotionMeta) potionInvisible.getItemMeta();
        potionMetaInvisible.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 0, 0), true);
        potionMetaInvisible.setDisplayName(ChatColor.WHITE + "Невидимость");
        potionMetaInvisible.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        potionMetaInvisible.setColor(Color.WHITE);
        potionInvisible.setItemMeta(potionMetaInvisible);

        ItemStack itemStackBack = new ItemStack(Material.BARRIER);
        ItemMeta itemMetaBack = itemStackBack.getItemMeta();
        itemMetaBack.setDisplayName(ChatColor.LIGHT_PURPLE + "Вернуться назад");
        itemStackBack.setItemMeta(itemMetaBack);


        inventory.addItem(itemStackSword);
        inventory.addItem(itemStackGapple);
        inventory.addItem(itemStackPearl);
        inventory.setItem(18, potionSpeed);
        inventory.setItem(19, potionInvisible);
    }

    private Inventory invTheShadow; //Создали инвентарь

    public Inventory getInvTheShadow() {
        return invTheShadow;
    }

    public KitTheShadow() {
        invTheShadow = Bukkit.createInventory(null, 27, "Тень");
        KitTheShadow.kitTheShadowAddItem(invTheShadow); // Метод, добавляющий предметы в инвентарь

    }
}
