package parousiametrisi.loststars.loststarventures.com.core

import android.Manifest
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.fondesa.kpermissions.extension.permissionsBuilder
import com.fondesa.kpermissions.request.PermissionRequest
import com.fondesa.kpermissions.request.runtime.nonce.PermissionNonce
import parousiametrisi.loststars.loststarventures.com.R
import parousiametrisi.loststars.loststarventures.com.logger.Logger

class SplashActivity: BaseActivity(), PermissionRequest.AcceptedListener,
    PermissionRequest.DeniedListener,PermissionRequest.PermanentlyDeniedListener,
    PermissionRequest.RationaleListener{

    override fun onPermissionsAccepted(permissions: Array<out String>) {
        Logger.logI(msg="onPermissionsAccepted")
    }

    override fun onPermissionsDenied(permissions: Array<out String>) {
        Logger.logI( msg="onPermissionsDenied")
    }

    override fun onPermissionsPermanentlyDenied(permissions: Array<out String>) {
        Logger.logI( msg="onPermissionsPermanentlyDenied")
    }

    override fun onPermissionsShouldShowRationale(permissions: Array<out String>, nonce: PermissionNonce) {
        Logger.logI(msg="onPermissionsShouldShowRationale")
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_splash)
        requestPermission()
        Logger.logI(msg="SplashActivity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Logger.logI(msg="SplashActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.logI(msg="SplashActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Logger.logI(msg="SplashActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.logI(msg="SplashActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.logI(msg="SplashActivity onDestroy")
    }


    fun requestPermission(){
        Logger.logI(msg="requestPermission")
        val request = permissionsBuilder(Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.ACCESS_FINE_LOCATION).build()
        request.acceptedListener(this)
        request.deniedListener(this)
        request.permanentlyDeniedListener(this)
        request.rationaleListener(this)
        request.send()

    }
}