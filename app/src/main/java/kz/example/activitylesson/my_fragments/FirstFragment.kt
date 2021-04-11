package kz.example.activitylesson.my_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.example.activitylesson.R

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/11/21
 */

class FirstFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        return view
    }
}