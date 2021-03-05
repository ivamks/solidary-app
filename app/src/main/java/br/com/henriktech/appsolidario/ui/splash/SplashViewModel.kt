package br.com.henriktech.appsolidario.ui.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    val intentLiveData = MutableLiveData<Boolean>()

    fun startApp() {
        GlobalScope.launch {
            delay(2000)
            intentLiveData.postValue(true)
        }
    }
}