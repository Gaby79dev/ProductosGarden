package com.productos.productosgarden.ui

import android.os.Bundle
import android.util.Log
import android.util.Log.DEBUG
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.productos.productosgarden.BuildConfig.DEBUG
import com.productos.productosgarden.adapter.BolleriaPequeAdapter
import com.productos.productosgarden.data.bolleriaPeque
import com.productos.productosgarden.databinding.FragmentBolleriaPequeBinding
import com.productos.productosgarden.viewModel.BpViewModel
import kotlinx.android.synthetic.main.bolleriapeque_row.*


class BolleriaPequeFragment : Fragment() {

    private var _binding: FragmentBolleriaPequeBinding? = null
    private val binding get() = _binding!!


    private lateinit var adapter: BolleriaPequeAdapter
    private val viewModel by lazy { ViewModelProvider(this).get(BpViewModel::class.java) }

    private var dataList = mutableListOf<bolleriaPeque>()


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBolleriaPequeBinding.inflate(inflater, container, false)

        adapter = BolleriaPequeAdapter(requireContext()) //inicia el latenit adapter lo antes posible


        button()

        setupRecyclerView()




        return binding.root

    }


    private fun setupRecyclerView() {


        binding.rvBolleriaPeque.layoutManager = LinearLayoutManager(requireContext()) // RecyclerView bollería pequeña
        binding.rvBolleriaPeque.adapter = adapter




        observeData()


    }

    private fun observeData() {

        viewModel.fetchBpData().observe(viewLifecycleOwner, {
            adapter.setListData(it)

            adapter.notifyDataSetChanged()

        })

    }


    private fun button() {


        switch1?.setOnClickListener {

            if (switch1!!.isPressed) {

                val fromPosition = 1
                val toPosition = 2
                val item = dataList[fromPosition]
                dataList.removeAt(fromPosition)
                dataList.add(toPosition, item)
                adapter.setListData(dataList)
                adapter.notifyDataSetChanged()


                adapter.notifyItemMoved(fromPosition, toPosition)



            }

        }


    }


}

