package br.com.henriktech.appsolidario.analytics

import android.app.Activity

interface AnalyticsProvider {
    fun trackScreen(activity: Activity, screenName: String, params: Map<String, String> = emptyMap())
    fun trackEvent(eventName: String, params: Map<String, String> = emptyMap())
}