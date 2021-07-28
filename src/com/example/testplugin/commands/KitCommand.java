package com.example.testplugin.commands;

import com.example.testplugin.Main;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KitCommand implements CommandExecutor {
    private Main plugin;

    public KitCommand(Main plugin){
        this.plugin = plugin;
        plugin.getCommand("kit").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)){
            commandSender.sendMessage("Only players can use this command");
            return true;
        }

        Player player = (Player) commandSender;

        ItemStack axe = new ItemStack(Material.IRON_AXE);
        ItemMeta axeItemMeta = axe.getItemMeta();
        axeItemMeta.setUnbreakable(true);
        axe.setItemMeta(axeItemMeta);
        player.getInventory().addItem(axe);

        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowItemMeta = bow.getItemMeta();
        bowItemMeta.setUnbreakable(true);
        bow.setItemMeta(bowItemMeta);
        bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        player.getInventory().addItem(bow);

        player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 64));

        player.getInventory().addItem(new ItemStack(Material.ARROW));

        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmetItemMeta = helmet.getItemMeta();
        helmetItemMeta.setUnbreakable(true);
        helmet.setItemMeta(helmetItemMeta);

        ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta chestplateItemMeta = chestplate.getItemMeta();
        chestplateItemMeta.setUnbreakable(true);
        chestplate.setItemMeta(chestplateItemMeta);

        ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta leggingsItemMeta = leggings.getItemMeta();
        leggingsItemMeta.setUnbreakable(true);
        leggings.setItemMeta(leggingsItemMeta);

        ItemStack boots = new ItemStack(Material.IRON_BOOTS);
        ItemMeta bootsItemMeta = boots.getItemMeta();
        bootsItemMeta.setUnbreakable(true);
        boots.setItemMeta(bootsItemMeta);

        player.getInventory().setHelmet(helmet);
        player.getInventory().setChestplate(chestplate);
        player.getInventory().setLeggings(leggings);
        player.getInventory().setBoots(boots);

        player.getInventory().setItemInOffHand(new ItemStack(Material.SHIELD));

        player.sendMessage("yes this works lol");


        return false;
    }
}
