package io.github.Nirhjah.BasicCommand;

import org.bukkit.command.CommandExecutor;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.Nirhjah.BasicCommand.Commands.TutorialCommand;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getLogger().info("Towel Command has been enabled!");
		this.getCommand("towel").setExecutor((CommandExecutor)new TutorialCommand());
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Basic Command has been disabled");
	}

}
