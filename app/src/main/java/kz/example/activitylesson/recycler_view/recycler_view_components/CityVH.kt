package kz.example.activitylesson.recycler_view.recycler_view_components

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kz.example.activitylesson.R
import kz.example.activitylesson.recycler_view.models.City

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/4/21
 */

class CityVH(
    private val view: View,
    private val itemClickListener: ItemClickListener<City>?,
    private val clickListener: (City) -> Unit
) : RecyclerView.ViewHolder(view) {

    fun bind(city: City) {
        val tvCity: TextView = view.findViewById(R.id.tvCity)
        val ivCity: ImageView = view.findViewById(R.id.ivCity)

        tvCity.text = city.name

        Glide.with(view)
            .load(city.imageUrl)
            .into(ivCity)

//        view.setOnClickListener {
//            itemClickListener.onClick(city)
//        }

        view.setOnClickListener {
            clickListener.invoke(city)
        }

    }
}