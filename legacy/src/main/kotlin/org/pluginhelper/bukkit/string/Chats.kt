package org.pluginhelper.bukkit.string

import org.bukkit.ChatColor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

fun Player.toSend(message: String) = sendMessage(message.colorize())

fun CommandSender.toSend(message: String) = sendMessage(message.colorize())

fun String.colorize(altColorChar: Char = '&'): String =
    ChatColor.translateAlternateColorCodes(altColorChar, this)