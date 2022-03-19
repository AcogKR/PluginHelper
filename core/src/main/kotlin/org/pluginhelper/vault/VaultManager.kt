package org.pluginhelper.vault

import net.milkbowl.vault.economy.Economy
import org.bukkit.Bukkit
import org.bukkit.entity.Player

class VaultManager(private val player: Player) {

    private val economy = Bukkit.getServicesManager().load(Economy::class.java)

    fun getMoney() = economy?.getBalance(player)

    fun withdrawMoney(amount: Double) = economy?.withdrawPlayer(player, amount)

    fun depositMoney(amount: Double) = economy?.depositPlayer(player, amount)
}