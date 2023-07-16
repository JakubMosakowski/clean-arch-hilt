import com.mosjak.getLib
import com.mosjak.getVersionCatalog

plugins {
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.kapt")
}

dependencies {
    "implementation"(getVersionCatalog().getLib("hilt-android"))
    "kapt"(getVersionCatalog().getLib("hilt-compiler"))
}
