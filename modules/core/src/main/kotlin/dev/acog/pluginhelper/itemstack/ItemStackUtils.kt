package dev.acog.pluginhelper.itemstack

import org.bukkit.craftbukkit.v1_19_R1.inventory.CraftItemStack
import org.bukkit.inventory.ItemStack

class ItemStackUtils {

    companion object {
        fun translateKey(item: ItemStack): String = CraftItemStack.asNMSCopy(item).p()
    }

}