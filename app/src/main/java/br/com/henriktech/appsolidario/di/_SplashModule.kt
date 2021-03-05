package br.com.henriktech.appsolidario.di

import br.com.henriktech.appsolidario.ui.splash.SplashAnalytics
import br.com.henriktech.appsolidario.ui.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

object _SplashModule {
    private val splashModule = module {
        single {
            SplashAnalytics(get())
        }
        viewModel { SplashViewModel() }
    }

    fun get() = splashModule

}