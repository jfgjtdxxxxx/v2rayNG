plugins {
    // برای مدیریت لایسنس‌ها (اختیاری)
    alias(libs.plugins.gradle.license.plugin) apply false
}

buildscript {
    dependencies {
        // برای desugar در سطح پروژه
        classpath(libs.desugar.jdk.libs)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}