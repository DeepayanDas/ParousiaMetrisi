package parousiametrisi.loststars.loststarventures.com.location

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import parousiametrisi.loststars.loststarventures.com.logger.Logger

class LocationChangeListener : BroadcastReceiver() {


    override fun onReceive(context: Context?, intent: Intent?) {
        Logger.logI(msg = "LocationChangeListener")
    }

}