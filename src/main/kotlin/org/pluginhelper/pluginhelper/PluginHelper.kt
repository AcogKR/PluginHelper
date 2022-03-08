@file:Suppress("DEPRECATION")

package org.pluginhelper.pluginhelper

import kr.entree.spigradle.annotations.SpigotPlugin
import org.bukkit.Material
import org.bukkit.plugin.java.JavaPlugin
import org.pluginhelper.pluginhelper.bukkit.item.item
import org.pluginhelper.pluginhelper.bukkit.item.meta

@SpigotPlugin
class PluginHelper : JavaPlugin() {

    override fun onEnable() {
        listOf(
            "PluginHelper Acog Plugin Support",
        ).forEach(logger::info)
    }

    override fun onDisable() {
        super.onDisable()
    }
}