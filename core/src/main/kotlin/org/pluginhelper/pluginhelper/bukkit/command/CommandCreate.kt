package org.pluginhelper.pluginhelper.bukkit.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.pluginhelper.pluginhelper.bukkit.exception.NullCommandException
import org.pluginhelper.pluginhelper.bukkit.exception.NullPlayerException
import org.pluginhelper.pluginhelper.bukkit.exception.NullShopException
import org.pluginhelper.pluginhelper.bukkit.string.colorize
import org.pluginhelper.pluginhelper.bukkit.string.message
import java.lang.NumberFormatException

abstract class CommandCreate : CommandExecutor {

    abstract var command: String

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        runCatching {
            execute(sender, command, label, args)
        }.recoverCatching {
            when(it) {
                is NullCommandException -> sender.sendMessage(it.error.colorize)
                is NullPlayerException -> sender.sendMessage(it.error.colorize)
                is NullShopException -> sender.sendMessage(it.error.colorize)
                is NumberFormatException -> sender.sendMessage("잘못된 값을 입력하셨습니다.")
            }
        }
        return false
    }

    abstract fun execute(sender: CommandSender, command: Command, label: String, args: Array<out String>)

    fun CommandSender.toPlayer() : Player? = if(this is Player) this else null
}