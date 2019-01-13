package parousiametrisi.loststars.loststarventures.com.logger

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import parousiametrisi.loststars.loststarventures.com.constant.AppConstants
import java.lang.invoke.ConstantCallSite

class Logger: AnkoLogger  {

    companion object   {
        fun logI(TAG: String=AppConstants.DEFAULT_TAG, msg:String){
           val log = AnkoLogger(TAG)
            log.info { msg }
        }

    }
}