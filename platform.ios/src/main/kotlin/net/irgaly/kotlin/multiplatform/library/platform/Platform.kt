package net.irgaly.kotlin.multiplatform.library.platform

import platform.UIKit.*

actual object Platform {
    actual val model: String
        get() = UIDevice.currentDevice.model
}