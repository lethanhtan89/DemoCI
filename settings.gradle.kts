pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        maven("https://jitpack.io")
        // wheel picker
        maven("https://maven.scijava.org/content/repositories/public/")
        // hyper verge
//        maven {
//            url = uri("https://s3.ap-south-1.amazonaws.com/hvsdk/android/releases")
//        }
        flatDir {
            dirs("libs")
        }

//        maven {
//            url = uri("https://maven.pkg.github.com/itd-hdbank/sdk-hdbank-platform")
//            credentials {
//                username = providers.gradleProperty("gpr.user").orNull
//                password = providers.gradleProperty("gpr.key").orNull
//            }
//        }
    }
}

rootProject.name = "DemoCI"
include(":app")
include(":sdk")
