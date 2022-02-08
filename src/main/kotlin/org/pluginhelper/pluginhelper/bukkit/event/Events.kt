package org.pluginhelper.pluginhelper.bukkit.event

import org.bukkit.event.player.PlayerMoveEvent

val PlayerMoveEvent.isWalked: Boolean
    get() {
        val toLoc = to
        return toLoc != null
                && (from.blockX != toLoc.blockX
                || from.blockY != toLoc.blockY
                || from.blockZ != toLoc.blockZ)
    }