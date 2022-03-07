@file:Suppress("DEPRECATION")

package org.pluginhelper.pluginhelper.bukkit.player

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.util.*

fun String.toPlayer() : Player? = Bukkit.getPlayer(toString())

fun UUID.toPlayer() = Bukkit.getPlayer(this) ?: Bukkit.getOfflinePlayer(this)