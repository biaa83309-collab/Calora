plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.bia.calora.data"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }
}

dependencies {
    implementation(project(":domain"))
}
