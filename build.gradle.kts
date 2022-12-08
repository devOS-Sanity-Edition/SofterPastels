plugins {
    id("fabric-loom")
    `maven-publish`
    java
}

group = property("maven_group")!!
version = property("mod_version")!!

repositories {
    mavenCentral()
    maven { url = uri("https://maven.wispforest.io") }
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
    exclusiveContent {
        forRepository {
            maven {
                name = "Modrinth"
                url = uri("https://api.modrinth.com/maven")
            }
        }
        filter {
            includeGroup("maven.modrinth")
        }
    }
    maven { url = uri("https://storage.googleapis.com/devan-maven/") }
}



dependencies {
    minecraft("com.mojang:minecraft:${property("minecraft_version")}")
    mappings(loom.officialMojangMappings())

    modImplementation("net.fabricmc:fabric-loader:${property("loader_version")}")

    modImplementation("net.fabricmc.fabric-api:fabric-api:${property("fabric_version")}")

    modImplementation("io.wispforest:owo-lib:${property("owo_version")}")
    modImplementation("net.devtech:arrp:${property("arrp_version")}")

    include("io.wispforest:owo-sentinel:${property("owo_version")}")
    include("net.devtech:arrp:${property("arrp_version")}")


    // for devenv
    modImplementation("maven.modrinth:sodium:mc1.19.2-0.4.4")
    implementation("org.joml:joml:1.10.5")
}

tasks {
    processResources {
        inputs.property("version", project.version)
        filesMatching("fabric.mod.json") {
            expand(mutableMapOf("version" to project.version))
        }
    }

    jar {
        from("LICENSE")
    }

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                artifact(remapJar) {
                    builtBy(remapJar)
                }
            }
        }

        // select the repositories you want to publish to
        repositories {
            maven {
                url = uri("https://mvn.devos.one/${System.getenv("PUBLISH_SUFFIX")}/")
                credentials {
                    username = System.getenv("MAVEN_USER")
                    password = System.getenv("MAVEN_PASS")
                }

                authentication { create<BasicAuthentication>("basic") }
            }
        }
    }


}

java {
    // Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
    // if it is present.
    // If you remove this line, sources will not be generated.
    withSourcesJar()
}
