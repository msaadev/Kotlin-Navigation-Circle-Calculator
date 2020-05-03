package com.msamil.msaStudio_CircleAreaAndCircumference.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.msamil.msaStudio_CircleAreaAndCircumference.R
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        areaButton.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToAreaFragment()
            Navigation.findNavController(it).navigate(action)
        }

        cevreButton.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToCevreFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
