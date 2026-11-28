plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.bia.calora.domain"
    compileSdk = 37
}

dependencies {
    testImplementation(libs.junit)
}
