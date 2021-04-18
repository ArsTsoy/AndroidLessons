package kz.example.activitylesson.recycler_view.in_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kz.example.activitylesson.R
import kz.example.activitylesson.recycler_view.models.City
import kz.example.activitylesson.recycler_view.recycler_view_components.CityRVAdapter

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/11/21
 */

class CityListFragment : Fragment() {

    //region Vars
    private val cities = listOf<City>(
        City(
            "Almaty",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png"
        ),
        City(
            "Nur-Sultan",
            "https://images.ctfassets.net/hrltx12pl8hq/7yQR5uJhwEkRfjwMFJ7bUK/dc52a0913e8ff8b5c276177890eb0129/offset_comp_772626-opt.jpg?fit=fill&w=800&h=300"
        ),
        City(
            "Karaganda",
            "https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg"
        ),
        City(
            "Atyrau",
            "https://static.remove.bg/remove-bg-web/71dbdf11b48cb655eefe2f609ad67295258ae141/assets/start-0e837dcc57769db2306d8d659f53555feb500b3c5d456879b9c843d1872e7baa.jpg"
        ),
        City("Shymkent", "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"),
        City(
            "Semey",
            "https://filedn.com/ltOdFv1aqz1YIFhf4gTY8D7/ingus-info/BLOGS/Photography-stocks3/stock-photography-slider.jpg"
        ),
        City(
            "Petropavlovsk",
            "https://filedn.com/ltOdFv1aqz1YIFhf4gTY8D7/ingus-info/BLOGS/Photography-stocks3/stock-photography-slider.jpg"
        ),
        City(
            "Taraz",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png"
        ),
        City(
            "Almaty1",
            "https://static.remove.bg/remove-bg-web/71dbdf11b48cb655eefe2f609ad67295258ae141/assets/start-0e837dcc57769db2306d8d659f53555feb500b3c5d456879b9c843d1872e7baa.jpg"
        ),
        City(
            "Almaty2",
            "https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg"
        ),
        City("Almaty3", "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"),
        City(
            "Almaty4",
            "https://filedn.com/ltOdFv1aqz1YIFhf4gTY8D7/ingus-info/BLOGS/Photography-stocks3/stock-photography-slider.jpg"
        ),
        City(
            "Almaty5",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png"
        ),
        City("Almaty6", "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"),
        City(
            "Almaty7",
            "https://static.remove.bg/remove-bg-web/71dbdf11b48cb655eefe2f609ad67295258ae141/assets/start-0e837dcc57769db2306d8d659f53555feb500b3c5d456879b9c843d1872e7baa.jpg"
        ),
        City(
            "Almaty8",
            "https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg"
        ),
        City("Almaty9", "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"),
        City("Almaty10", "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"),
        City(
            "Almaty11",
            "https://static.remove.bg/remove-bg-web/71dbdf11b48cb655eefe2f609ad67295258ae141/assets/start-0e837dcc57769db2306d8d659f53555feb500b3c5d456879b9c843d1872e7baa.jpg"
        ),
        City(
            "Almaty12",
            "https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg"
        ),
        City(
            "Almaty13",
            "https://filedn.com/ltOdFv1aqz1YIFhf4gTY8D7/ingus-info/BLOGS/Photography-stocks3/stock-photography-slider.jpg"
        ),
        City(
            "Almaty14",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png"
        ),
        City(
            "Almaty15",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png"
        ),
    )
    //endregion

    //region CREATE
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_city_list, container, false)
    }
    //endregion

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewCities = view.findViewById<RecyclerView>(R.id.rvCities)
        recyclerViewCities.layoutManager = LinearLayoutManager(requireContext())
        recyclerViewCities.adapter = CityRVAdapter(
            cities,
            null
        ) { goToCityDetail(it) }
        recyclerViewCities.addItemDecoration(
            DividerItemDecoration(this.requireContext(), DividerItemDecoration.VERTICAL)
        )
    }

    private fun goToCityDetail(city: City) {
        val fragment = CityDetailFragment.createFragment(city)
        fragmentManager
            ?.beginTransaction()
            ?.replace(R.id.flSingleSampleContainer, fragment, "gt")
            ?.addToBackStack(null)
            ?.commit()
    }
}