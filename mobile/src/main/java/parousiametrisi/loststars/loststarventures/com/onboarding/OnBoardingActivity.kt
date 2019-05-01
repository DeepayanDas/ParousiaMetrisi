package parousiametrisi.loststars.loststarventures.com.onboarding

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import parousiametrisi.loststars.loststarventures.com.R
import parousiametrisi.loststars.loststarventures.com.core.BaseActivity

class OnBoardingActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
       setContentView(R.layout.activity_on_boarding)

    }

}