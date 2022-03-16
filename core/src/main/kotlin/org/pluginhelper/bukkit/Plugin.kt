package org.pluginhelper.z.bukkit.plugin

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import org.pluginhelper.bukkit.command.CommandCreate

fun JavaPlugin.registerListener(vararg listener: Listener) = listener.forEach {
        event -> server.pluginManager.registerEvents(event, this)
}

fun JavaPlugin.registerCommand(vararg command: CommandCreate) = command.forEach {
        cmd -> getCommand(cmd.command)?.setExecutor(cmd)
}

inline fun <reified T : JavaPlugin> pluginOf(): T {
    return JavaPlugin.getPlugin(T::class.java)
}