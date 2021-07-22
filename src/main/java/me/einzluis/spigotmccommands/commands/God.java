package me.einzluis.spigotmccommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Checks if the sender is a player
        if(sender instanceof Player){
            Player player = (Player) sender;
            // If the command is on, turn it off
            if(player.isInvulnerable()){
                player.setInvulnerable(false);
                player.sendMessage(ChatColor.GREEN + "God: OFF");
            }else{
                // If the command is off, turn it on
                player.setInvulnerable(true);
                player.sendMessage(ChatColor.GREEN + "God: ON");
            }
        }else{
            // Prints out this message in the console if the sender is not a player
            System.out.println("You need to be a player to execute this command.");
        }

        return false;
    }
}
