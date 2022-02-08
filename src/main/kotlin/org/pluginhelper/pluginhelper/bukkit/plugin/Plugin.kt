package org.pluginhelper.pluginhelper.bukkit.plugin

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import org.pluginhelper.pluginhelper.bukkit.command.CommandCreate

fun JavaPlugin.registerListener(vararg listener: Listener) = listener.forEach {
        event -> server.pluginManager.registerEvents(event, this)
}

fun JavaPlugin.registerCommand(vararg command: CommandCreate) = command.forEach {
        cmd -> getCommand(cmd.command).executor = cmd
}