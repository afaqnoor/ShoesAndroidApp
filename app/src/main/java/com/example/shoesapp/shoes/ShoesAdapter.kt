package com.example.shoesapp.shoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.R

class ShoesAdapter(private var shoesArray: ArrayList<ShoesItem>) :
    RecyclerView.Adapter<ShoesAdapter.ViewHolder>() {


    private var shoesList: List<ShoesItem> = emptyList()

    fun setData(data: List<ShoesItem>) {
        this.shoesList = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.shoes_each_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var currentItem = shoesArray[position]
        holder.shoesName.text = currentItem.name
        holder.shoesDis.text = currentItem.dis
        holder.shoesPrice.text =currentItem.price
        holder.shoesImage.setImageResource(currentItem.image)
    }

    override fun getItemCount(): Int {
        return shoesArray.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var shoesName: TextView = itemView.findViewById(R.id.tvshoesName)
        var shoesDis: TextView = itemView.findViewById(R.id.tvshoesDis)
        var shoesPrice: TextView = itemView.findViewById(R.id.tvshoesPrice)
        var shoesImage: ImageView = itemView.findViewById(R.id.shoesImage)
    }
}