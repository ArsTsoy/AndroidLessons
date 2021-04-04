package kz.example.activitylesson.recycler_view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kz.example.activitylesson.R
import kz.example.activitylesson.recycler_view.models.City
import kz.example.activitylesson.recycler_view.recycler_view_components.CityRVAdapter
import kz.example.activitylesson.recycler_view.recycler_view_components.ItemClickListener

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/4/21
 */

class RecyclerViewActivity : AppCompatActivity() {

    private val cities = listOf<City>(
        City("Almaty", ""),
        City("Nur-Sultan", ""),
        City("Karaganda", ""),
        City("Atyrau", ""),
        City("Shymkent", ""),
        City("Semey", ""),
        City("Petropavlovsk", ""),
        City("Taraz", ""),
        City("Almaty1", ""),
        City("Almaty2", ""),
        City("Almaty3", ""),
        City("Almaty4", ""),
        City("Almaty5", ""),
        City("Almaty6", ""),
        City("Almaty7", ""),
        City("Almaty8", ""),
        City("Almaty9", ""),
        City("Almaty10", ""),
        City("Almaty11", ""),
        City("Almaty12", ""),
        City("Almaty13", ""),
        City("Almaty14", ""),
        City("Almaty15", ""),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerViewCities = findViewById<RecyclerView>(R.id.rvCities)
        recyclerViewCities.layoutManager = LinearLayoutManager(this)
        recyclerViewCities.adapter = CityRVAdapter(
            cities,
            object : ItemClickListener<City> {
                override fun onClick(model: City) {
                    Toast.makeText(
                        this@RecyclerViewActivity,
                        "${model.name} was clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            }
        ) {
            Toast.makeText(
                this,
                "${it.name} was clicked from lambda",
                Toast.LENGTH_SHORT
            ).show()
        }
        recyclerViewCities.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }
}