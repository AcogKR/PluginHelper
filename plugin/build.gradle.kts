import kr.entree.spigradle.kotlin.spigot
import kr.entree.spigradle.kotlin.spigotmc

plugins {
    kotlin("jvm") version "1.6.10"
    id("maven-publish")
    id("kr.entree.spigradle.base") version "2.3.4"
}

group = "org.pluginhelper"
version = "1.0.0"

tasks.compileJava.get().options.encoding = "UTF-8"

repositories {
    mavenCentral()
    spigotmc()
}

dependencies {
    compileOnly(spigot("1.18"))
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}


