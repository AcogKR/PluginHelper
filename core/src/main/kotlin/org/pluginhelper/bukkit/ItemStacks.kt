package org.pluginhelper.bukkit

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

fun Material.toItem(amount: Int = 1) = ItemStack(this, amount)

fun item(material: Material, amount: Int = 1, c: ItemStack.() -> Unit = {}) = material.toItem(amount).apply(c)

fun item(itemStack: ItemStack, amount: Int = 1, c: ItemStack.() -> Unit = {}) =
    ItemStack(itemStack).apply {
        setAmount(amount)
        c()
    }

fun ItemStack.setDisplayName(display: String) = itemMeta?.setDisplayName(display)

fun ItemStack.setLore(lore: List<String>) { itemMeta?.lore = lore }

fun ItemStack.setLore(vararg lore: String) { setLore(*lore) }

fun ItemStack.name() = itemMeta?.displayName ?: type.name