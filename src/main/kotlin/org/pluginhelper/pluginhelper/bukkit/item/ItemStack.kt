package org.pluginhelper.pluginhelper.bukkit.item

import org.bukkit.Material
import org.bukkit.OfflinePlayer
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.SkullMeta

fun Material.toItem(amount: Int = 1): ItemStack = ItemStack(this, amount)

fun item(material: Material, amount: Int = 1, c: ItemStack.() -> Unit = {}) = material.toItem(amount).apply(c)

fun item(material: Material, amount: Int = 1, damage: Short, c: ItemStack.() -> Unit = {}) = ItemStack(material, amount, damage).apply(c)

inline fun item(item: ItemStack, amount: Int = item.amount, configure: ItemStack.() -> Unit = {}) =
    ItemStack(item).apply {
        setAmount(amount)
        configure()
    }

fun ItemStack.name() = itemMeta?.displayName ?: type.name

fun itemOfSkull(player: OfflinePlayer?, configure: SkullMeta.() -> Unit) =
    item(Material.SKULL_ITEM, 1, 3) {
        metaOf<SkullMeta> {
            owningPlayer = player
            configure(this)
        }
    }