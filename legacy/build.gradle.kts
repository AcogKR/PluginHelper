import kr.entree.spigradle.kotlin.spigot
import kr.entree.spigradle.kotlin.spigotmc
import kr.entree.spigradle.kotlin.vault

plugins {
    kotlin("jvm") version "1.6.10"
    id("signing")
    id("maven-publish")
    id("kr.entree.spigradle") version "2.3.4"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "org.pluginhelper"
version = "1.0.1"

tasks.compileJava.get().options.encoding = "UTF-8"

repositories {
    mavenCentral()
    mavenLocal()
    vault()
    spigotmc()
}

dependencies {
    compileOnly(spigot("1.12.2"))
    compileOnly(vault())
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}


publishing {
    publications {
        create("maven", MavenPublication::class) {
            from(components["java"])
        }
    }
}
