package kz.example.activitylesson

import android.graphics.BitmapFactory
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/14/21
 */

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("myActivitySecond", "onCreate")


        val editText: EditText = findViewById(R.id.btnShowToast)
        val btnSave: Button = findViewById(R.id.btnSave)

        btnSave.setOnClickListener {
            Log.i("mySecondActivity", "text in field: ${editText.text}")
        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        val imageView: ImageView = findViewById(R.id.imageView)
        val bm = BitmapFactory.decodeResource(resources, R.drawable.image)
        // 1-ый способ
        imageView.setImageBitmap(bm)
        // 2-ой способ
        imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.image))
        // 3-ий способ
        imageView.setImageResource(R.drawable.image)
    }

    override fun onStart() {
        super.onStart()
        Log.i("myActivitySecond", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("myActivitySecond", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("myActivitySecond", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("myActivitySecond", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("myActivitySecond", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("myActivitySecond", "onDestroy")
    }

}