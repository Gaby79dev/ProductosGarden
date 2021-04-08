package com.productos.productosgarden.domain.data.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.FirebaseFirestore
import com.productos.productosgarden.data.bolleriaPeque


class Repo {

    fun getBpData():LiveData<MutableList<bolleriaPeque>>{

        val mutableData = MutableLiveData<MutableList<bolleriaPeque>>()
        FirebaseFirestore.getInstance().collection("bolleriaPeque").get().addOnSuccessListener {result ->

            val listData = mutableListOf<bolleriaPeque>()

            for(document in result ){
                val name = document.getString("name")
                val imageUrl = document.getString("imageUrl")

                val bolleriaPeque = bolleriaPeque(name!!,imageUrl!!)
                listData.add(bolleriaPeque)

            }
              mutableData.value = listData

        }

        return mutableData

    }

}