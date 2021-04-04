package kz.example.activitylesson

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import kz.example.activitylesson.databinding.ActivityFirstBinding
import kz.example.activitylesson.fragments.FirstFragment
import kz.example.activitylesson.fragments.SecondFragment

class FirstActivity : FragmentActivity() {
    private lateinit var binding: ActivityFirstBinding
    private var isAddTransaction = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val intent = Intent(Intent.ACTION_DIAL)

        binding.switchAddTransactionType.setOnCheckedChangeListener { _, isChecked ->
            isAddTransaction = isChecked

            val type = if(isAddTransaction) {
                "ADD"
            } else {
                "REPLACE"
            }
            binding.switchAddTransactionType.text = "Transaction type($type used)"
            Log.i("myActivityFirst", "---------------------------" +
                    "\nchangeType to $type" +
                    "\n---------------------------")
//            if(isChecked) {
//
//            } else {
//
//            }
        }

        binding.btnFirstFragment.setOnClickListener {
            val fragment = FirstFragment()
            val ft = supportFragmentManager
                .beginTransaction()
            ft.addToBackStack(null)
            if(isAddTransaction) {
                ft.add(R.id.fragmentContainer, fragment, "firstFragment")
            } else {
                ft.replace(R.id.fragmentContainer, fragment, "firstFragment")
            }
            ft.commit()
        }

        binding.btnSecondFragment.setOnClickListener {
            val fragment = SecondFragment()
            val ft = supportFragmentManager
                .beginTransaction()
            ft.addToBackStack(null)
            if(isAddTransaction) {
                ft.add(R.id.fragmentContainer, fragment, "secondFragment")
            } else {
                ft.replace(R.id.fragmentContainer, fragment, "secondFragment")
            }
            ft.commit()
        }

        binding.btnNextActivity.setOnClickListener {
            goToSecondActivity()
        }

//        setupBtn()

    }



    private fun setupBtn() {
        Log.i("myActivityFirst", "onCreate")
        val btnNextActivity = findViewById<Button>(R.id.btnNextActivity)
        val btnShowSnackbar = findViewById<Button>(R.id.btnShowSnackbar)
        val editText = findViewById<EditText>(R.id.etName)

        btnNextActivity.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                goToSecondActivity()
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

    private fun goToSecondActivity() {
        val intent = Intent(this@FirstActivity.applicationContext, SecondActivity::class.java)
        startActivity(intent)
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

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }
}