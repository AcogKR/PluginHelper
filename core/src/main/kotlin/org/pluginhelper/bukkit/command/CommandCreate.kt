package org.pluginhelper.bukkit.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.lang.NumberFormatException

abstract class CommandCreate : CommandExecutor {

    abstract var command: String

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        runCatching {
            execute(sender, command, label, args)
        }.recoverCatching {
        }
        return false
    }

    abstract fun execute(sender: CommandSender, command: Command, label: String, args: Array<out String>)

    fun CommandSender.toPlayer() : Player? = if(this is Player) this else null
}

/*
reified fun pluginOf<A>(): A {
  return JavaPlugin.getPlugin(A::class.java)
}
 */