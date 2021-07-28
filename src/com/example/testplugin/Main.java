package com.example.testplugin;
import com.example.testplugin.commands.KitCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        new KitCommand(this);
    }
}
