plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.recyclerview"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.recyclerview"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    //core
    implementation("androidx.core:core-ktx:1.12.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //activity-ktx
    implementation("androidx.activity:activity-ktx:1.8.2")

    //lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    //appcompat
    implementation("androidx.appcompat:appcompat:1.6.1")

    //constraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    //recyclerview
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    //junit
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
}