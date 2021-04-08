package com.productos.productosgarden.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.productos.productosgarden.databinding.FragmentHeladosBinding


class HeladosFragment : Fragment() {

    private var _binding: FragmentHeladosBinding?=null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
       _binding = FragmentHeladosBinding.inflate(inflater,container,false)
        return binding.root
    }


}