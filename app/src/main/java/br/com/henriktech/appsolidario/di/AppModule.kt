package br.com.henriktech.appsolidario.di

import org.koin.core.context.loadKoinModules

object AppModule {

    fun loadModule() {
        loadKoinModules(
            listOf(
                _SplashModule.get()
            ))
    }
}