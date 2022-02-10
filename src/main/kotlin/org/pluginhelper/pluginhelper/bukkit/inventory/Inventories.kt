package org.pluginhelper.pluginhelper.bukkit.inventory

import org.bukkit.Bukkit
import org.bukkit.inventory.Inventory

fun inventory(title: String, row: Int = 1, c: Inventory.() -> Unit): Inventory = Bukkit.createInventory(null, row * 9, title).apply(c)
