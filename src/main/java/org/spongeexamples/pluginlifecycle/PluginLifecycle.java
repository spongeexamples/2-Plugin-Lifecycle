package org.spongeexamples.pluginlifecycle;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.*;
import org.spongepowered.api.plugin.Plugin;

/**
 * The main class of the plugin PluginLifecycle
 */
/*
 * Unlike bukkit, sponge does not have onEnable() and onDisable() methods.
 * But certain events replace them.
 */
@Plugin(id = "spongeexamples.pluginlifecycle", name = "PluginLifecycle", version = "1.0")
public class PluginLifecycle {

    @Listener
    public void preInit(GamePreInitializationEvent event) {
        // During this stage, the plugin is able to access the logger and the configuration files
    }

    @Listener
    public void init(GameInitializationEvent event) {
        // During this stage, the plugin finishes work to be functional, including registering commands
    }

    @Listener
    public void postInit(GamePostInitializationEvent event) {
        // During this stage, API, logger, and configuration files are prepared to be interacted with.
    }

    @Listener
    public void serverAboutToStart(GameAboutToStartServerEvent event) {
        // During this stage, the plugin can register create new worlds.
    }

    @Listener
    public void serverStarting(GameStartingServerEvent event) {
        // During this stage, the plugin can register create new worlds.
    }

    @Listener
    public void serverStopping(GameStoppingServerEvent event) {
       // During this stage, the plugin can store its data to disk.
    }

    /*
     * There are other events that you can find in GameState enum class
     */

}
