package com.cursokotlin.appturismoconcellodeteo.ui.patrimonio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cursokotlin.appturismoconcellodeteo.R

class PatrimonioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(R.layout.fragment_patrimonio,container,false)

        return root
    }

}