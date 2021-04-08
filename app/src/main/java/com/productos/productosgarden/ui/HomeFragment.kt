package com.productos.productosgarden.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.productos.productosgarden.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        loadImages()
        navigationFragment()

        return binding.root
    }

    private fun loadImages(){
        //images
        // bolleria pequeña
        Glide.with(this).load("https://pansgranier.com/wp-content/uploads/2017/12/dulce-premium-pequena.jpg").into(binding.ivpeque)
        //bollería grande
        Glide.with(this).load("https://lh3.googleusercontent.com/proxy/8TlVtWHrFZ-qwPsw6uPnL-lBR3DEELKtHA1yFYrXrIIctifLcbfOcI8ic_k4uPiAqPgzZCeaEVmX-My1TskcZz_FXDNuZ4ba28ugFikuQY1ZYMStZusQkwN_9O3WFlzcPg").centerInside().into(binding.ivgrande)
        //tartas
        Glide.with(this).load("https://www.cocinaabuenashoras.com/files/tarta-de-3-chocolates-cortada-copia-768x512.jpg").into(binding.ivtarta)
        //helados
        Glide.with(this).load("https://economia3.com/wp-content/uploads/2019/08/heladeros-Vitrina-gelats.jpg").into(binding.ivhelados)

    }

    fun navigationFragment(){

        binding.cvbolleriapeque.setOnClickListener { findNavController().navigate(
            HomeFragmentDirections.actionNavHomeToBolleriaPequeFragment()
        ) }
        binding.cvBolleriaGrande.setOnClickListener { findNavController().navigate(
            HomeFragmentDirections.actionNavHomeToBolleriaGranFragment()
        ) }
        binding.cvtartas.setOnClickListener { findNavController().navigate(HomeFragmentDirections.actionNavHomeToTartasFragment()) }
        binding.cvhelados.setOnClickListener { findNavController().navigate(HomeFragmentDirections.actionNavHomeToHeladosFragment()) }

    }


}