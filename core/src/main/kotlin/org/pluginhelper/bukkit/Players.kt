package org.pluginhelper.bukkit

import org.bukkit.Bukkit
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import java.util.*
import kotlin.collections.HashSet

fun String.toPlayer() : Player? = Bukkit.getPlayer(toString())

fun UUID.toPlayer() = Bukkit.getPlayer(this) ?: Bukkit.getOfflinePlayer(this)

fun UUID.toOfflinePlayer() = Bukkit.getOfflinePlayer(this)

fun OfflinePlayer.toPlayer() = uniqueId.toPlayer()

fun Player.toOfflinePlayer() = Bukkit.getOfflinePlayer(uniqueId)

fun Player.aroundPlayers(radius : Int) : HashSet<Player> {
    return Bukkit.getOnlinePlayers().filter { players ->
        location.distanceSquared(players.location) <= radius * radius
    }.toHashSet()
}