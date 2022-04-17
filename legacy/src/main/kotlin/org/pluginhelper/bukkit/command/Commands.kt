package org.pluginhelper.bukkit.command

import org.bukkit.entity.Player
import org.pluginhelper.bukkit.exceptions.CommandArgumentNullException
import org.pluginhelper.bukkit.exceptions.PlayerCastingException
import org.pluginhelper.bukkit.toPlayer

fun <T> Array<out T>.getOrThrow(index: Int, error: String): T {
    return if (index in 0..lastIndex) get(index) else throw CommandArgumentNullException(error)
}

fun String.getPayerOrThrow(error: String): Player {
    return toPlayer() ?: throw PlayerCastingException(error)
}