package de.crack.lp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.crack.lp.main.Main;

public class Command_Heal implements CommandExecutor{
	
	public Main plugin;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("system.heal")) {
				if(args.length == 0) {
					p.setHealth(20);
					p.sendMessage(Main.plugin+"§aDu wurdest geheilt!");
				} else if(args.length == 1) {
					Player target = Bukkit.getPlayer(args[0]);
					if(target != null) {
						target.setHealth(20);
						target.sendMessage(Main.plugin+"§aDu hast den Spieler §6"+target.getDisplayName()+" §ageheilt§c!");
					} else {
						p.sendMessage(Main.plugin+"§cDer Spieler §6"+args[0]+" §c ist nich online!");
					}
				} else {
					p.sendMessage(Main.plugin+"§cBitte benutze §6/heal <Spieler>");
				}
			} else {
				p.sendMessage(Main.plugin+"§cDazu hast du keine Rechte!");
			}
		} else {
			sender.sendMessage(Main.plugin+"§4Du must ein Spieler sein!");
		}
		return false;
	}

}
