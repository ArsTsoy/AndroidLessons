package kz.example.activitylesson

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/14/21
 */

class FourActivity : AppCompatActivity(){

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
    }

    override fun onStart() {
        super.onStart()
        Log.d("myFourActivity", "onStart")
        getString(R.string.some_string)
    }

    override fun onResume() {
        super.onResume()
        Log.i("myFourActivity", "onResume")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.i("myFourActivity", "onConfigurationChanged")
    }

}