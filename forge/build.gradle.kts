plugins {
    id("cobblemon.platform-conventions")
    id("cobblemon.publish-conventions")
}

architectury {
    platformSetupLoomIde()
    forge()
}

repositories {
    maven(url = "https://thedarkcolour.github.io/KotlinForForge/")
    mavenLocal()
    maven {
        url = uri("https://cursemaven.com")
        content {
            includeGroup("curse.maven")
        }
    }
}

dependencies {
    forge(libs.forge)
    modApi(libs.architecturyForge)

    implementation(project(":common", configuration = "namedElements")) {
        isTransitive = false
    }
    implementation(libs.kotlinForForge)
    "developmentForge"(project(":common", configuration = "namedElements")) {
        isTransitive = false
    }
    bundle(project(path = ":common", configuration = "transformProductionForge")) {
        isTransitive = false
    }
    testImplementation(project(":common", configuration = "namedElements"))

    modApi(libs.cobblemonForge) {
        exclude(group = "net.minecraftforge")
    }

    listOf(
        libs.stdlib,
        libs.serializationCore,
        libs.serializationJson,
        libs.reflect
    ).forEach(::forgeRuntimeLibrary)

    modApi(libs.configurateCore)
    modApi(libs.configurateHocon)
    modApi(libs.configurateGson) {
        exclude("com.google.code.gson") // Use Minecraft's gson
    }
    modApi(libs.configurateDfu4) {
        exclude("com.mojang")
    }
    bundle(libs.configurateCore)
    bundle(libs.configurateHocon)
    bundle(libs.configurateGson) {
        exclude("com.google.code.gson") // Use Minecraft's gson
    }
    bundle(libs.configurateDfu4) {
        exclude("com.mojang")
    }
}

tasks {
//    shadowJar {
//        relocate ("org.spongepowered", "io.github.waterpicker.relocation.spongepowered")
//    }

    processResources {
        inputs.property("version", rootProject.version)

        filesMatching("META-INF/mods.toml") {
            expand("version" to rootProject.version)
        }
    }
}