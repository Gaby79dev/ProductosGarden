package com.productos.productosgarden.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.productos.productosgarden.data.bolleriaPeque
import com.productos.productosgarden.domain.data.network.Repo

class BpViewModel: ViewModel() {

    private val repo = Repo()

    fun fetchBpData(): LiveData<MutableList<bolleriaPeque>> {

        val mutableData = MutableLiveData<MutableList<bolleriaPeque>>()

        repo.getBpData().observeForever{
            mutableData.value = it

        }

        return mutableData

    }


}