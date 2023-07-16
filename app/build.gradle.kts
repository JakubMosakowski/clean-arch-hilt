plugins {
    id("android-app-convention")
    id("hilt-convention")
}

android {
    namespace = "com.mosjak.cleanarchhilt.app"

    defaultConfig {
        applicationId = "com.mosjak.cleanarchhilt"
        versionName = "0.0.1"
        versionCode = 1
    }
}

dependencies {
    implementation(project(":feature:quote:data"))
    implementation(project(":feature:quote:presentation"))
}
