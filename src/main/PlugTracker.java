package main;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class PlugTracker extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info(pdffile.getName() + " is now disabled.");
	}
	
	@Override
	public void onEnable()
	{
		this.getCommand("PlugTracker").setExecutor(new PlugCommand());
	}

}
