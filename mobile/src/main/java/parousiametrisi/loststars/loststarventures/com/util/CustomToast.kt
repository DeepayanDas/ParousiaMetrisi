package parousiametrisi.loststars.loststarventures.com.util

import android.content.Context
import parousiametrisi.loststars.loststarventures.com.core.ParousiaMetrisiApp
import parousiametrisi.loststars.loststarventures.com.logger.Logger

class CustomToast{
    init {
        Logger.logI(msg = "CustomToast init")
        instance = this
    }

    companion object {
        private var instance: CustomToast? = null

       /* fun getInstance() : CustomToast {
            return instance!!.CustomToast()
        }*/
    }
}