package org.pluginhelper.bukkit

import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

inline fun ItemStack.meta(configure: ItemMeta.() -> Unit) = metaOf(configure)

inline fun <reified T : ItemMeta> ItemStack.metaOf(configure: T.() -> Unit) {
    val meta = itemMeta
    if (meta is T) {
        meta.configure()
        itemMeta = meta
    } else throw IllegalStateException("$type meta of item isn't ${T::class.java.simpleName}")
}
