package kz.example.activitylesson.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.example.activitylesson.databinding.FragmentFirstBinding
import kz.example.activitylesson.databinding.FragmentSecondBinding

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/30/21
 */

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("myFragmentSecond", "onCreateView")
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onAttach(context: Context) {
        Log.i("myFragmentSecond", "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("myFragmentSecond", "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i("myFragmentSecond", "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.i("myFragmentSecond", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("myFragmentSecond", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("myFragmentSecond", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("myFragmentSecond", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("myFragmentSecond", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("myFragmentSecond", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("myFragmentSecond", "onDetach")
        super.onDetach()
    }

}