package com.productos.productosgarden.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.productos.productosgarden.databinding.FragmentTartasBinding


class TartasFragment : Fragment() {

    private var _binding : FragmentTartasBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTartasBinding.inflate(inflater,container,false)
        return binding.root
    }


}