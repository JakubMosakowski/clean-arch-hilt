plugins {
    id("android-library-convention")
    id("hilt-convention")
}

android {
    namespace = "com.mosjak.cleanarchhilt.feature.quote.data"
}

dependencies {
    implementation(project(":feature:quote:domain"))
}
