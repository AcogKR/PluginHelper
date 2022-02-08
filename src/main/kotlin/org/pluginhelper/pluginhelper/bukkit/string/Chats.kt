package org.pluginhelper.pluginhelper.bukkit.string

import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

fun Player.message(message: String) = this.sendMessage(message.colorize)

fun CommandSender.message(message: String) = this.sendMessage(message.colorize)

val String.colorize get() = this.replace("&", "§")