package org.pluginhelper.pluginhelper

import kr.entree.spigradle.annotations.SpigotPlugin
import org.bukkit.Material
import org.bukkit.plugin.java.JavaPlugin
import org.pluginhelper.pluginhelper.bukkit.item.item

@SpigotPlugin
class PluginHelper : JavaPlugin() {

    override fun onEnable() {
        listOf(
            "해당 플러그인은 Acog 의 개인 라이브러리 입니다.",
            "타 플러그인에는 아무 지장이 없고 주문제작된 플러그인에 API를 지원합니다."
        ).forEach(logger::info)
        val item = item(Material.ACACIA_DOOR_ITEM, 1) {

        }
    }

    override fun onDisable() {
        super.onDisable()
    }
}