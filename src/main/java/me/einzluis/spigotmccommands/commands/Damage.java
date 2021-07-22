package me.einzluis.spigotmccommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Damage implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // FOR TESTING PURPOSES ONLY!!! (Use /damage to test /heal, etc.)

        // Checks if the sender is a player
        if(sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GREEN + "Health (-1)");
            // Removes 1 heart from player
            player.setHealth(player.getHealth() - 2);
        }else{
            // Prints out this message in the console if the sender is not a player
            System.out.println("You need to be a player to use this command.");
        }

        return false;
    }
}
