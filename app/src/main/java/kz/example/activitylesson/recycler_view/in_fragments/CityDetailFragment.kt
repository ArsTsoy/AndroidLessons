package kz.example.activitylesson.recycler_view.in_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kz.example.activitylesson.CityDetailActivity
import kz.example.activitylesson.R
import kz.example.activitylesson.recycler_view.models.City

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/11/21
 */

class CityDetailFragment: Fragment() {


    //region CREATE
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_city_detail, container, false)
    }
    //endregion

    companion object {
        private const val CITY = "CITY"

        fun createFragment(city: City): CityDetailFragment {
            val fragment = CityDetailFragment()
            val bundle = Bundle()
            bundle.putSerializable(CITY, city)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ivCityDetail = view.findViewById<ImageView>(R.id.ivCityDetail)
        val tvCityDetail = view.findViewById<TextView>(R.id.tvCityDetail)

        if(arguments != null) {
            val city = arguments?.getSerializable(CITY) as? City?
            if(city != null) {
                Glide.with(this)
                    .load(city.imageUrl)
                    .into(ivCityDetail)

                tvCityDetail.text = city.name
            }
        }

    }
}