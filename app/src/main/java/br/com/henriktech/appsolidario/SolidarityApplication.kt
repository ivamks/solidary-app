package br.com.henriktech.appsolidario

import android.app.Application
import br.com.henriktech.appsolidario.analytics.di.AnalyticsModule
import br.com.henriktech.appsolidario.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class SolidarityApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@SolidarityApplication)
        }
        AnalyticsModule.loadModule()
        AppModule.loadModule()
    }
}