plugins {
    alias(libs.plugins.kotlin.android)
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    testImplementation(libs.junit)
}
