/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("gh.merge.queue.test.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("gh.merge.queue.test.app.AppKt")
}
