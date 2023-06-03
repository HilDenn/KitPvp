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

import java.util.ArrayList;
import java.util.List;
public class KitsMenu {
    public Inventory getKitMenuInventory() {
        return kitMenuInventory;
    }

    private final Inventory kitMenuInventory;

    public KitsMenu() {
        List<String> info = new ArrayList<>();
        info.add(ChatColor.DARK_BLUE + (ChatColor.BOLD + "ЛКМ - Выбрать"));
        info.add(ChatColor.DARK_BLUE + (ChatColor.BOLD + "ПКМ - Посмотреть"));
        kitMenuInventory = Bukkit.createInventory(null, 27, "Меню китов");
        //Лучник
        ItemStack itemStackArcher = new ItemStack(Material.BOW);
        ItemMeta itemMetaArcher = itemStackArcher.getItemMeta();
        itemMetaArcher.setLocalizedName(ChatColor.LIGHT_PURPLE + "Лучник");
        itemMetaArcher.setLore(info);
        itemStackArcher.setItemMeta(itemMetaArcher);
        kitMenuInventory.addItem(itemStackArcher);

        //Мечник
        ItemStack itemStackSwordmen = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMetaSwordmen = itemStackSwordmen.getItemMeta();
        itemMetaSwordmen.setDisplayName(ChatColor.BLUE + "Мечник");
        itemMetaSwordmen.setLore(info);
        itemMetaSwordmen.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemStackSwordmen.setItemMeta(itemMetaSwordmen);
        kitMenuInventory.addItem(itemStackSwordmen);

        //Танк
        ItemStack itemStackTank = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta itemMetaTank = itemStackTank.getItemMeta();
        itemMetaTank.setDisplayName(ChatColor.DARK_BLUE + "Танк");
        itemMetaTank.setLore(info);
        itemMetaTank.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemStackTank.setItemMeta(itemMetaTank);
        kitMenuInventory.addItem(itemStackTank);

        //Assasin
        ItemStack itemStackAssasin = new ItemStack(Material.IRON_SWORD);
        ItemMeta itemMetaAssasin = itemStackAssasin.getItemMeta();
        itemMetaAssasin.setDisplayName(ChatColor.WHITE + "Ассасин");
        itemMetaAssasin.setLore(info);
        itemMetaAssasin.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemStackAssasin.setItemMeta(itemMetaAssasin);
        kitMenuInventory.addItem(itemStackAssasin);

        //Alchemist
        ItemStack itemStackAlchemist = new ItemStack(Material.SPLASH_POTION);
        PotionMeta itemMetaAlchemist = (PotionMeta) itemStackAlchemist.getItemMeta();
        itemMetaAlchemist.setDisplayName(ChatColor.DARK_GREEN + "Алхимик");
        itemMetaAlchemist.setColor(Color.RED);
        itemMetaAlchemist.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        itemMetaAlchemist.setLore(info);
        itemStackAlchemist.setItemMeta(itemMetaAlchemist);
        kitMenuInventory.addItem(itemStackAlchemist);

        //Shadow
        ItemStack itemStackShadow = new ItemStack(Material.FIREWORK_CHARGE);
        ItemMeta itemMetaShadow = itemStackShadow.getItemMeta();
        itemMetaShadow.setDisplayName(ChatColor.GRAY + "Тень");
        itemMetaShadow.setLore(info);
        itemMetaShadow.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        itemStackShadow.setItemMeta(itemMetaShadow);
        kitMenuInventory.addItem(itemStackShadow);

        //Elusive
        ItemStack itemStackElusive = new ItemStack(Material.CHORUS_FRUIT);
        ItemMeta itemMetaElusive = itemStackElusive.getItemMeta();
        itemMetaElusive.setDisplayName(ChatColor.DARK_RED + "Неуловимый");
        itemMetaElusive.setLore(info);
        itemMetaElusive.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemStackElusive.setItemMeta(itemMetaElusive);
        kitMenuInventory.addItem(itemStackElusive);


    }
}

