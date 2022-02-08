import kr.entree.spigradle.kotlin.spigot

val libraryVersion = "1.0.1"

plugins {
    kotlin("jvm") version "1.5.10"
    id("kr.entree.spigradle") version "2.3.4"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("maven-publish")
    java

}

group = "org.pluginhelper"
version = libraryVersion

tasks.compileJava.get().options.encoding = "UTF-8"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(spigot("1.12.2"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.pluginhelper"
            artifactId = "PluginHelper"
            version = libraryVersion
            from(components["java"])
        }
    }
}
