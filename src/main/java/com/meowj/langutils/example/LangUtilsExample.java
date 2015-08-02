/*
 * Copyright (c) 2015 Jerrell Fang
 *
 * This project is Open Source and distributed under The MIT License (MIT)
 * (http://opensource.org/licenses/MIT)
 *
 * You should have received a copy of the The MIT License along with
 * this project.   If not, see <http://opensource.org/licenses/MIT>.
 */

package com.meowj.langutils.example;

import com.meowj.langutils.lang.LanguageHelper;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;
import java.util.logging.Level;

/**
 * Created by Meow J on 6/30/2015.
 *
 * @author Meow J
 */
public class LangUtilsExample extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        info("Language Utils Example has been enabled.");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        info("Language Utils Example has been disabled.");
    }

    public void info(String msg) {
        getLogger().log(Level.INFO, msg);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("itemname")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                ItemStack itemStack = player.getItemInHand();
                final long startTime = System.nanoTime();
                player.sendMessage("You are holding " + ChatColor.GREEN + LanguageHelper.getItemDisplayName(itemStack, player) + ChatColor.RESET + ".(" + (System.nanoTime() - startTime) / 1000 + "μs)");
                return true;
            } else
                sender.sendMessage("Only player can use this command");
        } else if (command.getName().equalsIgnoreCase("showenchant")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                ItemStack itemStack = player.getItemInHand();
                player.sendMessage(ChatColor.GREEN + "The enchantments of this item are:");
                Map<Enchantment, Integer> enchants = itemStack.getEnchantments();
                for (Map.Entry<Enchantment, Integer> entry : enchants.entrySet()) {
                    final long startTime = System.nanoTime();
                    player.sendMessage(" - " + ChatColor.AQUA + LanguageHelper.getEnchantmentDisplayName(entry, player) + ChatColor.RESET + ".(" + (System.nanoTime() - startTime) / 1000 + "μs)");
                }
                return true;
            } else
                sender.sendMessage("Only player can use this command");
        }
        return false;
    }

    @EventHandler
    public void onClickEntity(PlayerInteractEntityEvent event) {
        final long startTime = System.nanoTime();
        event.getPlayer().sendMessage("You are touching " + ChatColor.GREEN + LanguageHelper.getEntityDisplayName(event.getRightClicked(), event.getPlayer()) + ChatColor.RESET + ".(" + (System.nanoTime() - startTime) / 1000 + "μs)");
    }
}
