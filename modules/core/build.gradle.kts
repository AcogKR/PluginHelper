import kr.entree.spigradle.kotlin.spigotAll

plugins {
    kotlin("jvm") version "1.8.0"
    id("kr.entree.spigradle.base") version "2.4.3"
    id("maven-publish")
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly(spigotAll("1.19.2"))
    api("io.typecraft:bukkit-view-core:5.0.0")
    api("io.typecraft:command-bukkit:0.7.0")

    implementation(kotlin("stdlib-jdk8"))
}

publishing {
    publications {
        create("pluginhelper", MavenPublication::class) {
            from(components["java"])
        }
    }
}