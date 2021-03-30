package kz.example.activitylesson

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        Log.i("myActivityFirst", "onCreate")
        val btnNextActivity = findViewById<Button>(R.id.btnNextActivity)
        val btnShowSnackbar = findViewById<Button>(R.id.btnShowSnackbar)
        val editText = findViewById<EditText>(R.id.etName)

        btnNextActivity.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@FirstActivity.applicationContext, SecondActivity::class.java)
                startActivity(intent)
//                Toast.makeText(this@FirstActivity, "Some text", Toast.LENGTH_LONG)
//                    .show()
            }

        })

//        button.setOnClickListener {
//            Toast.makeText(this@FirstActivity, "You write: ${editText.text}", Toast.LENGTH_LONG)
//                .show()
//        }

//        btnShowSnackbar.setOnClickListener {
//            val snackbar = Snackbar.make(
//                btnShowSnackbar,
//                "You write: ${editText.text}",
//                Snackbar.LENGTH_INDEFINITE
//            )
//            snackbar.setAction("Понял", {
//                snackbar.dismiss()
//            })
//            snackbar.show()
//
//        }
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

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.i("myActivityFirst", "onConfigurationChanged")
    }
}