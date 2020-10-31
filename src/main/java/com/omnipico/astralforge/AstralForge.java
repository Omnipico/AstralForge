package com.omnipico.astralforge;

import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class AstralForge extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        FileConfiguration config = this.getConfig();

        CommandAstralForge commandAstralForge = new CommandAstralForge();
        this.getCommand("astralforge").setExecutor(commandAstralForge);
        this.getCommand("astralforge").setTabCompleter(commandAstralForge);

        getServer().getPluginManager().registerEvents(new AstralForgeListener(), this);
    }

    @Override
    public void onDisable() {
        //Fired when the server stops and disables all plugins
    }
}
