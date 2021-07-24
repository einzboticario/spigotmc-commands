package me.einzluis.spigotmccommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PlayerVault implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Checks if the sender is a player
        if (sender instanceof Player){
            Player player = (Player) sender;
            // Creates inventory
            Inventory vault = Bukkit.createInventory(player, 45, ChatColor.DARK_BLUE + "Player Vault");
            // Opens the inventory
            player.openInventory(vault);
        }else{
            // Prints out this message in the console if the sender is not a player
            System.out.println("You need to be a player to execute this command.");
        }


        return true;
    }
}
