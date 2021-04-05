package kz.example.activitylesson

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kz.example.activitylesson.recycler_view.models.City

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/4/21
 */

class CityDetailActivity : AppCompatActivity() {

    companion object {

        private const val EXTRA_CITY = "EXTRA_CITY"

        fun createIntent(context: Context, city: City): Intent {
            val intent = Intent(context, CityDetailActivity::class.java)
            intent.putExtra(EXTRA_CITY, city)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_city_detail)

        val ivCityDetail = findViewById<ImageView>(R.id.ivCityDetail)
        val tvCityDetail = findViewById<TextView>(R.id.tvCityDetail)

        if(intent != null) {
            val city = intent.getSerializableExtra(EXTRA_CITY) as? City?
            if(city != null) {
                Glide.with(this)
                    .load(city.imageUrl)
                    .into(ivCityDetail)

                tvCityDetail.text = city.name
            }
        }

    }
}