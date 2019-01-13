package parousiametrisi.loststars.loststarventures.com

import android.app.Application
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ProcessLifecycleOwner
import parousiametrisi.loststars.loststarventures.com.logger.Logger

class ParousiaMetrisiApp: Application(), LifecycleObserver {



    override fun onCreate() {
        super.onCreate()
        Logger.logI(msg="Application onCreate")

        ProcessLifecycleOwner.get()
            .lifecycle
            .addObserver(ParousiaMetrisiApp())
    }


    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onTerminate() {
        super.onTerminate()
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectListener() {
        Logger.logI(msg="Event.ON_RESUME")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disconnectListener() {
        Logger.logI(msg="Event.ON_PAUSE")

    }

}