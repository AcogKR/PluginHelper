package org.pluginhelper.pluginhelper.bukkit.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.pluginhelper.pluginhelper.bukkit.exception.NullCommandException
import org.pluginhelper.pluginhelper.bukkit.exception.NullPlayerException

abstract class CommandCreate : CommandExecutor {

    abstract var command: String

    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {
        execute(sender, command, label, args)
        return false
    }

    abstract fun execute(sender: CommandSender, command: Command, label: String, args: Array<out String>)

    fun Array<out String>.value(index: Int, player: Player, error: String) : String {
        return if(this.getOrNull(index) != null) this[index] else throw NullCommandException(player, error)
    }

    fun CommandSender.player(error: String) : Player {
        return if(this is Player) this else throw NullPlayerException(this, error)
    }

}