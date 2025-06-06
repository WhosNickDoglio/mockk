plugins {
    `kotlin-dsl`
}

// set the versions of Gradle plugins that the subprojects will use here
val kotlinPluginVersion: String = "2.1.20"

val androidGradle = "8.9.2"
val kotlinxKover = "0.7.3"
val dokka = "2.0.0"
val binaryCompatibilityValidator = "0.17.0"

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:$kotlinPluginVersion"))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinPluginVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinPluginVersion")

    implementation("org.jetbrains.kotlinx.kover:org.jetbrains.kotlinx.kover.gradle.plugin:$kotlinxKover")

    implementation("com.android.tools.build:gradle:$androidGradle")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:$dokka")

    implementation("org.jetbrains.kotlinx:binary-compatibility-validator:$binaryCompatibilityValidator")
}
