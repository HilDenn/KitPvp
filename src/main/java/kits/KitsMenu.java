package kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
public class KitsMenu {
    public Inventory getKitMenuInventory() {
        return kitMenuInventory;
    }

    private final Inventory kitMenuInventory;

    public KitsMenu() {
        List<String> info = new ArrayList<String>();
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
        itemStackSwordmen.setItemMeta(itemMetaSwordmen);
        kitMenuInventory.addItem(itemStackSwordmen);

        //Танк
        ItemStack itemStackTank = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta itemMetaTank = itemStackTank.getItemMeta();
        itemMetaTank.setDisplayName(ChatColor.DARK_BLUE + "Танк");
        itemMetaTank.setLore(info);
        itemStackTank.setItemMeta(itemMetaTank);
        kitMenuInventory.addItem(itemStackTank);

        //Assasin
        ItemStack itemStackAssasin = new ItemStack(Material.IRON_SWORD);
        ItemMeta itemMetaAssasin = itemStackAssasin.getItemMeta();
        itemMetaAssasin.setDisplayName(ChatColor.WHITE + "Ассасин");
        itemMetaAssasin.setLore(info);
        itemStackAssasin.setItemMeta(itemMetaAssasin);
        kitMenuInventory.addItem(itemStackAssasin);
    }

//        kitMenuInventory.addItem(kitsMenuCreateItem(Material.BOW, "Лучник"));
//        kitMenuInventory.addItem(kitsMenuCreateItem(Material.DIAMOND_SWORD, "Мечник"));
//    }
//    public ItemStack kitsMenuCreateItem(Material material, String name) {
//        ItemStack itemStack = new ItemStack(material, 1);
//        ItemMeta itemMeta = itemStack.getItemMeta();
//        itemMeta.setDisplayName(name);
//        info.add("ЛКМ - Выбрать\nПКМ - Посмотреть");
//        itemMeta.setLore(info);
//
//        return itemStack;
//    }
//    public static ItemStack createItems(Material material, int amount, String name) {
//        Player player = null;
//        ItemStack itemStack = new ItemStack(material, amount);
//        ItemMeta itemMeta = itemStack.getItemMeta();
//        itemMeta.setDisplayName(name);
//        itemMeta.setUnbreakable(true);
//        if(itemStack.equals(Material.LEATHER_HELMET)
//                || itemStack.equals(Material.CHAINMAIL_HELMET)
//                || itemStack.equals(Material.GOLD_HELMET)
//                || itemStack.equals(Material.DIAMOND_HELMET)){
//            player.getEquipment().setHelmet(itemStack);
//        }
//        else if(itemStack.equals(Material.LEATHER_CHESTPLATE)
//                || itemStack.equals(Material.CHAINMAIL_CHESTPLATE)
//                || itemStack.equals(Material.GOLD_CHESTPLATE)
//                || itemStack.equals(Material.DIAMOND_CHESTPLATE)){
//            player.getEquipment().setChestplate(itemStack);
//        }
//        else if(itemStack.equals(Material.LEATHER_LEGGINGS)
//                || itemStack.equals(Material.CHAINMAIL_LEGGINGS)
//                || itemStack.equals(Material.GOLD_LEGGINGS)
//                || itemStack.equals(Material.DIAMOND_LEGGINGS)){
//            player.getEquipment().setLeggings(itemStack);
//        }
//        else if(itemStack.equals(Material.LEATHER_BOOTS)
//                || itemStack.equals(Material.CHAINMAIL_BOOTS)
//                || itemStack.equals(Material.GOLD_BOOTS)
//                || itemStack.equals(Material.DIAMOND_BOOTS)){
//            player.getEquipment().setBoots(itemStack);
//        }

//        return itemStack;

}

