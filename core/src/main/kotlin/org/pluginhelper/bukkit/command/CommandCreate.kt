package org.pluginhelper.bukkit.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.pluginhelper.bukkit.exceptions.CommandArgumentNullException
import org.pluginhelper.bukkit.exceptions.PlayerCastingException
import org.pluginhelper.bukkit.string.colorize
import org.pluginhelper.bukkit.string.toSend
import java.lang.NumberFormatException

abstract class CommandCreate : CommandExecutor {

    abstract var command: String

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        runCatching {
            execute(sender, command, label, args)
        }.recoverCatching {
            when (it) {
                is CommandArgumentNullException -> sender.toSend(it.message!!.colorize())
                is PlayerCastingException -> sender.toSend(it.message!!.colorize())
                is NumberFormatException -> sender.toSend(it.message!!.colorize())
            }
        }
        return false
    }

    abstract fun execute(sender: CommandSender, command: Command, label: String, args: Array<out String>)

    fun CommandSender.toPlayer() : Player? = if(this is Player) this else null
}

