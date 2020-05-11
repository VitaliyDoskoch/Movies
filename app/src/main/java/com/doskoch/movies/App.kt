package com.doskoch.movies

import android.app.Application
import com.doskoch.movies.dependencyInjection.Injector
import timber.log.Timber

@Suppress("unused")
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        Injector.init(this)

        initLogging()
    }

    private fun initLogging() {
        if (BuildConfig.is_logging_enabled) {
            Timber.plant(Timber.DebugTree())
        }
    }
}