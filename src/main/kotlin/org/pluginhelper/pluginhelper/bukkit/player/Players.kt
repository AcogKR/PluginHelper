@file:Suppress("DEPRECATION")

package org.pluginhelper.pluginhelper.bukkit.player

import org.bukkit.Bukkit
import org.bukkit.entity.Player

fun String.toPlayer() : Player? = Bukkit.getPlayer(toString())