package io.github.Nirhjah.BasicCommand.Commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TutorialCommand implements CommandExecutor {

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player){
            player.sendMessage("Lord is a towel.");
        }
        else {
            sender.sendMessage("Hey! You can't use this in the terminal!");
        }
        return true;
    }
 
}
