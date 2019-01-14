package parousiametrisi.loststars.loststarventures.com.network

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import parousiametrisi.loststars.loststarventures.com.logger.Logger

class NetworkChangeListener : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Logger.logI(msg = "NetworkChangeListener")
    }

}