package parousiametrisi.loststars.loststarventures.com.core

import android.app.Application
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ProcessLifecycleOwner
import android.content.BroadcastReceiver
import android.content.Context
import parousiametrisi.loststars.loststarventures.com.logger.Logger
import android.content.IntentFilter
import android.location.LocationManager
import parousiametrisi.loststars.loststarventures.com.location.LocationChangeListener
import parousiametrisi.loststars.loststarventures.com.network.NetworkChangeListener


class ParousiaMetrisiApp : Application(), LifecycleObserver {

    private val locationChangeListener: BroadcastReceiver = LocationChangeListener()
    private val networkChangeListener: BroadcastReceiver = NetworkChangeListener()

    init {
        Logger.logI(msg = "ParousiaMetrisiApp init")
        instance = this
    }

    companion object {
        private var instance: ParousiaMetrisiApp? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }


    override fun onCreate() {
        super.onCreate()
        Logger.logI(msg = "ParousiaMetrisiApp onCreate")

        ProcessLifecycleOwner.get()
            .lifecycle
            .addObserver(this)
    }


    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onTerminate() {
        super.onTerminate()
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun connectListener() {
        Logger.logI(msg = "Event.ON_START")
        addNetworkChangeListener()
        addLocationChangeListener()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun disconnectListener() {
        Logger.logI(msg = "Event.ON_STOP")
        removeNetworkChangeListener()
        removeLocationChangeListener()
    }


    private fun addNetworkChangeListener() {
        val filter = IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")
        registerReceiver(networkChangeListener, filter)

    }

    private fun addLocationChangeListener() {
        val filter = IntentFilter(LocationManager.PROVIDERS_CHANGED_ACTION)
        registerReceiver(locationChangeListener, filter)
    }

    private fun removeNetworkChangeListener() {
        unregisterReceiver(networkChangeListener)

    }

    private fun removeLocationChangeListener() {
        unregisterReceiver(locationChangeListener)

    }
}