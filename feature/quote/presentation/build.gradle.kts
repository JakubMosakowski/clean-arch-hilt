plugins {
    id("android-library-convention")
    id("hilt-convention")
}

android {
    namespace = "com.mosjak.cleanarchhilt.feature.quote.presentation"
}

dependencies {
    implementation(project(":feature:quote:domain"))
    implementation(libs.fragment)
}
