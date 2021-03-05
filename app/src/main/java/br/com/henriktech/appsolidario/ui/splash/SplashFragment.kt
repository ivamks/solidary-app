package br.com.henriktech.appsolidario.ui.splash

import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import br.com.henriktech.appsolidario.R

class SplashFragment : Fragment(R.layout.fragment_splash) {

    private val analytics: SplashAnalytics by inject()
    private val viewModel: SplashViewModel by viewModel()

    override fun onStart() {
        super.onStart()

        initViewModel()
        activity?.let { analytics.trackScreen(it) }
        viewModel.startApp()
    }

    private fun initViewModel() {
        viewModel.intentLiveData.observe(this, Observer {
            activity?.let { it1 ->
                Navigation.findNavController(it1, R.id.nav_host_fragment)
                    .navigate(R.id.action_splashFragment_to_loginFragment)
            }
        })
    }
}