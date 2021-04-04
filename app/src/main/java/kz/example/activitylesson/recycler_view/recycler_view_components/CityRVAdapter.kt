package kz.example.activitylesson.recycler_view.recycler_view_components

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.example.activitylesson.R
import kz.example.activitylesson.recycler_view.models.City

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/4/21
 */

class CityRVAdapter(
    val items: List<City>,
    private val itemClickListener: ItemClickListener<City>,
    private val clickListener: (City) -> Unit
) : RecyclerView.Adapter<CityVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_city, parent, false)
        return CityVH(
            view,
            itemClickListener,
            clickListener
        )
    }

    override fun onBindViewHolder(holder: CityVH, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

}