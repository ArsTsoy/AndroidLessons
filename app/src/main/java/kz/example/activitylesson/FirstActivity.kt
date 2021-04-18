package kz.example.activitylesson

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kz.example.activitylesson.recycler_view.RecyclerViewActivity
import kz.example.activitylesson.recycler_view.in_fragments.SampleSingleActivity

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val button = findViewById<Button>(R.id.btnNextActivity)
        val btnShowSnackbar = findViewById<Button>(R.id.btnShowSnackbar)
        val editText = findViewById<EditText>(R.id.etName)
        button.setOnClickListener {
            goToActivity(MyFragmentActivity::class.java)
        }

        btnShowSnackbar.setOnClickListener {
//            val snackbar = Snackbar.make(
//                btnShowSnackbar,
//                "You write: ${editText.text}",
//                Snackbar.LENGTH_INDEFINITE
//            )
//            snackbar.setAction("Понял") {
//                snackbar.dismiss()
//            }
//            snackbar.show()
            goToActivity(SampleSingleActivity::class.java)

        }
    }

    //region Lifecycle
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
    //endregion

    //region Support
    private fun goToActivity(cls: Class<*>) {
        val intent = Intent(this, cls)
        startActivity(intent)
    }
    //endregion
}