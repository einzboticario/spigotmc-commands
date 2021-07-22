package me.einzluis.spigotmccommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Checks if the sender is a player
        if(sender instanceof Player){
            Player player = (Player) sender;
            // Checks if the player has permission (Do /op [player] to access fly)
            if(player.hasPermission("spigotmccommands.fly")){
                if(player.getAllowFlight()){
                    // If the command is on, turn it off
                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.GREEN + "Fly: OFF");
                }else{
                    // If the command is off, turn it on
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.GREEN + "Fly: ON");
                }
            }else{
                // Prints out this message if the player has no permission
                player.sendMessage(ChatColor.RED + "You do not have the permission to use this command.");
            }
        }else{
            // Prints out this message in the console if the sender is not a player
            System.out.println("You need to be a player to execute this command.");
        }

        return false;
    }
}
