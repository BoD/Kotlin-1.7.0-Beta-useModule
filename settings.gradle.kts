pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("org.jetbrains.kotlin.jvm")) {
                // Works:
                // useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")

                // Doesn't work:
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0-Beta")
            }
        }
    }
}
