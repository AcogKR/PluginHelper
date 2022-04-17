package org.pluginhelper.bukkit.exceptions

open class CommandArgumentNullException(private val error: String) : Exception(error)

open class PlayerCastingException(private val error: String) : Exception(error)

open class MessageException(private val error: String) : Exception(error)