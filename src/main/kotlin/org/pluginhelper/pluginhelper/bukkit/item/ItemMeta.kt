package org.pluginhelper.pluginhelper.bukkit.item

import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta
import org.pluginhelper.pluginhelper.bukkit.string.colorize

fun ItemStack.meta(c: ItemMeta.() -> Unit = {}) = setItemMeta(itemMeta.apply(c))

fun ItemMeta.setName(name: String) = setDisplayName(name.colorize)

fun ItemStack.setName(name: String) = meta { setName(name) }

fun ItemMeta.setLore(vararg lore: String) = setLore(lore.map { it.colorize })

fun ItemStack.setLore(vararg line: String) = meta { setLore(*line) }

fun ItemMeta.addLore(vararg lores: String) = lores.forEach(lore::add)

fun ItemStack.addLore(vararg lores: String) = meta { lores.forEach(lore::add) }

inline fun ItemMeta.lore(configure: MutableList<String>.() -> Unit) {
    val newLore = (lore ?: mutableListOf()).apply(configure).map { it.colorize }
    lore = newLore
}

inline fun <reified T : ItemMeta> ItemStack.metaOf(configure: T.() -> Unit) {
    val meta = itemMeta
    if (meta is T) {
        meta.configure()
        itemMeta = meta
    } else throw IllegalStateException("$type meta of item isn't ${T::class.java.simpleName}")
}