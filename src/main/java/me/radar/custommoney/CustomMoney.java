package me.radar.custommoney;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public final class CustomMoney extends JavaPlugin {

    public class Reds {
        public static ItemStack reds() {
            ItemStack glowingPaper = new ItemStack(Material.PAPER, 1);
            ItemMeta glowingPaperMeta = glowingPaper.getItemMeta();

            glowingPaperMeta.setDisplayName(ChatColor.GOLD + "Reds");
            List<String> lore = new ArrayList<>();
            lore.add(ChatColor.YELLOW + "Money");
            glowingPaperMeta.setLore(lore);
            glowingPaperMeta.addEnchant(Enchantment.LURE, 1, true);
            glowingPaperMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            glowingPaperMeta.setUnbreakable(true);

            glowingPaper.setItemMeta(glowingPaperMeta);
            glowingPaper.setAmount(1);

            return glowingPaper;


        }
    }
}
