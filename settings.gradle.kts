rootProject.name = "PluginHelper"

include("core", "plugin", "legacy")

rootProject.children.forEach {
    it.name = "${rootProject.name}-${it.name}"
}
