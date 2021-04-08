package com.productos.productosgarden.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.productos.productosgarden.R
import com.productos.productosgarden.data.bolleriaPeque
import kotlinx.android.synthetic.main.bolleriapeque_row.view.*


class BolleriaPequeAdapter(private val context: Context) : RecyclerView.Adapter<BolleriaPequeAdapter.MainViewHolder>() {


    private var dataList = mutableListOf<bolleriaPeque>()




    fun setListData(data : MutableList<bolleriaPeque>){


        dataList = data


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view: View? = LayoutInflater.from(parent.context).inflate(R.layout.bolleriapeque_row,parent,false)
        return MainViewHolder(view!!)
    }


    override fun getItemCount(): Int {

        return dataList.size

    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = dataList[position]
        holder.bindView(item)


    }

    inner class MainViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){



        fun bindView(item : bolleriaPeque){

            Glide.with(context).load(item.imageUrl).into(itemView.imagebp)
            itemView.txtBolleriaPeque.text = item.name



        }

    }



}






