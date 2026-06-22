plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.v2ray.ang"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.v2ray.ang"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {

    // AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.swiperefreshlayout)
    implementation(libs.recyclerview)
    implementation(libs.preference.ktx)
    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.fragment)

    // Lifecycle + ViewModel
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.runtime.ktx)

    // Coroutines
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)

    // OkHttp
    implementation(libs.okhttp)

    // Gson
    implementation(libs.gson)

    // ZXing
    implementation(libs.core)

    // MMKV
    implementation(libs.mmkv.static)

    // Toasty
    implementation(libs.toasty)

    // WorkManager
    implementation(libs.work.runtime.ktx)
    implementation(libs.work.multiprocess)

    // Flexbox
    implementation(libs.flexbox)

    // Quickie (QR Scanner)
    implementation(libs.quickie.foss)

    // EditorKit
    implementation(libs.editorkit)
    implementation(libs.language.base)
    implementation(libs.language.json)

    // Multidex
    implementation(libs.multidex)

    // Tests
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}