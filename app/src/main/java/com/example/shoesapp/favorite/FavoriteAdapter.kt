package com.example.shoesapp.favorite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.R
import com.example.shoesapp.shoes.ShoesItem

class FavoriteAdapter(private var favShoesArrayList: ArrayList<FavoriteItem>) :
    RecyclerView.Adapter<FavoriteAdapter.ViewHolder>() {


    private var fvshoesList: List<FavoriteItem> = emptyList()

    fun setData(data: List<FavoriteItem>) {
        this.fvshoesList = data
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteAdapter.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.fvshoes_each_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FavoriteAdapter.ViewHolder, position: Int) {
        val currentItem = favShoesArrayList[position]
        holder.shoesName.text = currentItem.favName
        holder.shoesDis.text = currentItem.favDis
        holder.shoesPrice.text =currentItem.favPrice
        holder.shoesImage.setImageResource(currentItem.favImage)
    }

    override fun getItemCount(): Int {
        return favShoesArrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var shoesName: TextView = itemView.findViewById(R.id.fvshoesName)
        var shoesDis: TextView = itemView.findViewById(R.id.fvshoesDis)
        var shoesPrice: TextView = itemView.findViewById(R.id.fvshoesPrice)
        var shoesImage: ImageView = itemView.findViewById(R.id.fvshoesImage)
    }
}