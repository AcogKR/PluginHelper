@file:Suppress("DEPRECATION")

package org.pluginhelper.pluginhelper.bukkit.player

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.pluginhelper.pluginhelper.bukkit.exception.NullPlayerException

fun String.toPlayer(player: Player, error: String) : Player = Bukkit.getPlayer(toString()) ?: throw NullPlayerException(player, error)