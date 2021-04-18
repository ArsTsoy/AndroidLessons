package kz.example.activitylesson.recycler_view.in_fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kz.example.activitylesson.R

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/11/21
 */

class SampleSingleActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_single)

        supportFragmentManager.beginTransaction()
            .replace(R.id.flSingleSampleContainer, CityListFragment())
            .commit()
    }
}