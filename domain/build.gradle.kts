plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.bia.calora.domain"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }
}

dependencies {
    testImplementation(libs.junit)
}
