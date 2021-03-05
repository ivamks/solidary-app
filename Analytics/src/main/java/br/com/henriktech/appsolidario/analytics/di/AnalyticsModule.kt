package br.com.henriktech.appsolidario.analytics.di

import br.com.henriktech.appsolidario.analytics.Analytics
import br.com.henriktech.appsolidario.analytics.provider.FirebaseAnalyticsProvider
import com.google.firebase.analytics.FirebaseAnalytics
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object AnalyticsModule {
    private val analyticsModule = module {
        single { Analytics(listOf(get<FirebaseAnalyticsProvider>())) }
        single { FirebaseAnalyticsProvider(get()) }
        factory { FirebaseAnalytics.getInstance(get()) }
    }
    fun loadModule() {
        loadKoinModules(
            listOf(
                analyticsModule
            ))
    }
}