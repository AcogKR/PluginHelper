package dev.acog.pluginhelper

import dev.acog.pluginhelper.component.ComponentUtils
import dev.acog.pluginhelper.itemstack.ItemStackUtils
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

interface BukkitCommand {

    fun test() {
        val translateKey = ItemStackUtils.translateKey(ItemStack(Material.ACACIA_BOAT))
        val display = ComponentUtils.localize(translateKey) // itemStack localization
        println(display)
    }

}