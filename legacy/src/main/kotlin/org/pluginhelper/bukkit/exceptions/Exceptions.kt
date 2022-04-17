package org.pluginhelper.bukkit.exceptions

open class CommandArgumentNullException(private val error: String) : MessageException(error)

open class PlayerCastingException(private val error: String) : MessageException(error)

open class MessageException(private val error: String) : Exception(error)