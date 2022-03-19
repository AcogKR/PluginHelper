package org.pluginhelper.bukkit.string

import org.bukkit.ChatColor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

fun Player.toSend(message: String) = sendMessage(message)

fun CommandSender.toSend(message: String) = sendMessage(message)

fun String.colorize(altColorChar: Char = '&') =
    ChatColor.translateAlternateColorCodes(altColorChar, this)