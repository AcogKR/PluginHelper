rootProject.name = "PluginHelper"

include("core", "plugin")

rootProject.children.forEach {
    it.name = "${rootProject.name}-${it.name}"
}
