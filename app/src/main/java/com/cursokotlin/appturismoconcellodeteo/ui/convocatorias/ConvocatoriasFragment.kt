package com.cursokotlin.appturismoconcellodeteo.ui.convocatorias

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cursokotlin.appturismoconcellodeteo.R

class ConvocatoriasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(R.layout.fragment_convocatorias,container,false)

        return root
    }

}