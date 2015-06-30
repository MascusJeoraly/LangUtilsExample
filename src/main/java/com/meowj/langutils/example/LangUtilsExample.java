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
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Created by Meow J on 6/30/2015.
 *
 * @author Meow J
 */
public class LangUtilsExample extends JavaPlugin {
    @Override
    public void onEnable() {
        info("Language Utils Example has been enabled.");
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
                player.sendMessage("You are holding " + LanguageHelper.getItemDisplayName(itemStack, player));
                return true;
            } else
                sender.sendMessage("Only player can use this command");
        }
        return false;
    }
}
