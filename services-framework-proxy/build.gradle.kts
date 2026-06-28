/*
 * SPDX-FileCopyrightText: 2026 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.google.android.gsf"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.google.android.gsf"
        minSdk = 18
        targetSdk = 37
        versionCode = 9
        versionName = "v0.1.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
