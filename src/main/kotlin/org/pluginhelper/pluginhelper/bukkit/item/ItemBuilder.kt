package org.pluginhelper.pluginhelper.bukkit.item

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class ItemBuilder(private val material: Material, private val amount: Int) {

    companion object {



    }

    fun build() : ItemStack {
        return TODO()
    }

    fun build(display: String, lores: List<String>) : ItemStack {
        return TODO()
    }
}

fun item(material: Material, amount: Int, c: ItemBuilder.() -> Unit) = ItemBuilder(material, amount).apply(c)

fun item(material: Material, display: String, lores: List<String> = listOf()) = ItemBuilder(material, 1).build()