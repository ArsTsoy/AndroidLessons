package kz.example.activitylesson

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val button = findViewById<Button>(R.id.btnNextActivity)

        button.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@FirstActivity.applicationContext, FourActivity::class.java)
                startActivity(intent)
            }

        })
    }


    override fun onStart() {
        super.onStart()
        Log.i("myActivityFirst", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("myActivityFirst", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("myActivityFirst", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("myActivityFirst", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("myActivityFirst", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("myActivityFirst", "onDestroy")
    }
}