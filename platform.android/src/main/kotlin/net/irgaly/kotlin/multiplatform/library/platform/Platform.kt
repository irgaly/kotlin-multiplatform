package net.irgaly.kotlin.multiplatform.library.platform

import android.os.Build

actual object Platform {
    actual val model: String
        get() = Build.MODEL
}