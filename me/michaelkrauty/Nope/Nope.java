package me.michaelkrauty.Nope;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Nope extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = this.getServer().getPlayer(args[0]);
		if(commandLabel.equalsIgnoreCase("nope"))	
			player.chat("Nope.");
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		player.kickPlayer("Nope.");
		return true;
	}
	
}