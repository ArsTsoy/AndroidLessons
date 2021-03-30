package kz.example.activitylesson.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.example.activitylesson.databinding.FragmentFirstBinding

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/30/21
 */

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("myFragmentFirst", "onCreateView")
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onAttach(context: Context) {
        Log.i("myFragmentFirst", "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("myFragmentFirst", "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i("myFragmentFirst", "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.i("myFragmentFirst", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("myFragmentFirst", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("myFragmentFirst", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("myFragmentFirst", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("myFragmentFirst", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("myFragmentFirst", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("myFragmentFirst", "onDetach")
        super.onDetach()
    }


}