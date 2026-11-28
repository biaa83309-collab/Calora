plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.bia.calora.data"
    compileSdk = 37
}

dependencies {
    implementation(project(":domain"))
}
