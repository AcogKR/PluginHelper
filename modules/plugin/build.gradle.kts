import kr.entree.spigradle.kotlin.spigot

plugins {
    kotlin("jvm") version "1.8.0"
    id("kr.entree.spigradle") version "2.4.3"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

dependencies {
    api(project(":pluginhelper-core"))

    implementation(kotlin("stdlib-jdk8"))
    compileOnly(spigot("1.19.2"))
}

spigot {
    name = "PluginHelper"
    apiVersion = "1.19"
    authors = listOf("Acog")
    website = "https://github.com/Acogkr/${name}"
}

tasks {
    assemble {
        dependsOn(shadowJar)
    }
}