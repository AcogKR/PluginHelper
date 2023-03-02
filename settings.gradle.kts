rootProject.name = "pluginhelper"
includeFlat("core", "plugin")

rootProject.children.forEach { project ->
    project.run {
        projectDir = file("modules/${name}")
        name = "${rootProject.name}-${name}"
    }
}
