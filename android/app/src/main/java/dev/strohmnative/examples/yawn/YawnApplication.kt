package dev.strohmnative.examples.yawn

import android.app.Application
import dev.strohmnative.StrohmNative

class YawnApplication: Application() {
    lateinit var strohmNative: StrohmNative

    override fun onCreate() {
        super.onCreate()
        strohmNative = StrohmNative.getInstance(applicationContext)
    }
}
