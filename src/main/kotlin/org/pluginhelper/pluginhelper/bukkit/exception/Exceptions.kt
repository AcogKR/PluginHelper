package org.pluginhelper.pluginhelper.bukkit.exception

import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.pluginhelper.pluginhelper.bukkit.string.message

open class NullCommandException(player: Player, error: String) : Exception(error) {
    init { player.message(error) }
}

open class NullPlayerException(player: CommandSender, error: String) : Exception(error) {
    init { player.message(error) }
}