package org.pluginhelper.bukkit

import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

fun Material.toItem(amount: Int = 1) : ItemStack = ItemStack(this, amount)

fun item(material: Material, amount: Int = 1, c: ItemStack.() -> Unit = {}) : ItemStack = material.toItem(amount).apply(c)

fun item(itemStack: ItemStack, amount: Int = 1, c: ItemStack.() -> Unit = {}) =
    ItemStack(itemStack).apply {
        setAmount(amount)
        c()
    }

fun ItemStack.setLore(vararg lore: String) { setLore(*lore) }

fun ItemStack.name() = itemMeta?.displayName ?: type.name