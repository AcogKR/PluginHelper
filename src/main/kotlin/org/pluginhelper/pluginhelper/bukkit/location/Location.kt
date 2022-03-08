package org.pluginhelper.pluginhelper.bukkit.location

import org.bukkit.entity.Player

fun Player.plusX(x: Int) {
    val location = this.location.apply { }
    location.x = location.x + x
    player.teleport(location)
}