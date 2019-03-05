package de.crack.lp.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.crack.lp.commands.Command_Heal;

public class Main extends JavaPlugin{
	
	public static String plugin = "§7[§4Heal§7]";
	
	@Override
	public void onEnable() {
		registerCommands();
		Bukkit.getConsoleSender().sendMessage("§7-----------------------");
		Bukkit.getConsoleSender().sendMessage("§6Plugin state: §aenabled!");
		Bukkit.getConsoleSender().sendMessage("   §6Author: §cCrackLPYT ");
		Bukkit.getConsoleSender().sendMessage("§7-----------------------");
	}
	
	private void registerCommands() {
		this.getCommand("heal").setExecutor(new Command_Heal());
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§7-----------------------");
		Bukkit.getConsoleSender().sendMessage("§6Plugin state: §4disabled!");
		Bukkit.getConsoleSender().sendMessage("   §6Author: §cCrackLPYT ");
		Bukkit.getConsoleSender().sendMessage("§7-----------------------");
	}
	
	

}
