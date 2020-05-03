package com.msamil.msaStudio_CircleAreaAndCircumference.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.msamil.msaStudio_CircleAreaAndCircumference.R
import com.msamil.msaStudio_CircleAreaAndCircumference.methods.methodie
import kotlinx.android.synthetic.main.fragment_cevre.*

class CevreFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cevre, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        radiusText.requestFocus()

    var pi = piText.text
    var radius = radiusText.text

    calculateButton.setOnClickListener {

        if (pi.isNullOrEmpty() || radius.isNullOrEmpty()){
            Toast.makeText(activity!!.applicationContext,"Please Write Correct Number !",Toast.LENGTH_LONG).show()
        }else{
            var sonuc = methodie().cevre(radius.toString().toFloat(), pi.toString().toFloat())
            println(sonuc)
            sonucView.text = "${sonuc}"
        }
    }
    }
}
