package me.einzluis.spigotmccommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Checks if the sender is a player
        if(sender instanceof Player){
            Player player = (Player) sender;
            // Checks the command if it has no argument
            if (args.length == 0) {
                player.sendMessage(ChatColor.RED + "You killed yourself.");
                player.setHealth(0);
                // If the command has an argument and the player has permission (Do /op [player] to access command)
            }else if ((args.length == 1) && (player.hasPermission("spigotmccommands.kill"))) {
                // Select target from argument
                Player target = Bukkit.getPlayerExact(args[0]);
                // Kills the target is target is valid
                if (target instanceof Player){
                    target.sendMessage(ChatColor.RED + "You have been killed."); // Sends message to target
                    target.setHealth(0); // Kills target
                    player.sendMessage("You just killed " + ChatColor.RED + "" + target.getDisplayName() + "."); // Sends message to player
                }else{
                    // Prints out message if target is invalid
                    player.sendMessage(ChatColor.RED + "The player is offline.");
                }
            }else {
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
