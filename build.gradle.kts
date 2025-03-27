plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "17" // Definindo o JVM target para Kotlin (pode ser 17 ou superior)
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(17) // Definindo o JVM target para Java (também 17 ou superior)
}

tasks.test {
    useJUnitPlatform()
}
