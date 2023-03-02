package dev.acog.pluginhelper.component

import net.md_5.bungee.api.chat.TranslatableComponent

class ComponentUtils {

    companion object {
        fun localize(value: String): String = TranslatableComponent(value).translate ?: value
    }

}