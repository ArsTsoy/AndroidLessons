package kz.example.activitylesson

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kz.example.activitylesson.my_fragments.FirstFragment
import kz.example.activitylesson.my_fragments.SecondFragment

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/11/21
 */

class MyFragmentActivity : AppCompatActivity() {

    //region Overridden Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_fragment)
        setupButtons()
    }
    //endregion

    //region Support
    private fun setupButtons() {
        val btnFirstFragment = findViewById<Button>(R.id.btnFirstFragment)
        val btnSecondFragment = findViewById<Button>(R.id.btnSecondFragment)

        btnFirstFragment.setOnClickListener { showFirstFragment() }
        btnSecondFragment.setOnClickListener { showSecondFragment() }
    }

    private fun showFirstFragment() {
        val fragment = FirstFragment()
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.flFragmentContainer, fragment, "firstFragment")
            .commit()
    }

    private fun showSecondFragment() {
        val fragment = SecondFragment()
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.flFragmentContainer, fragment, "secondFragment")
            .commit()
    }
    //endregion
}