package com.example.shoesapp.brand

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.R

class BrandAdapter(var brandArray: ArrayList<BrandItem>, var context: Activity) :
    RecyclerView.Adapter<BrandAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandAdapter.ViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.brand_each_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BrandAdapter.ViewHolder, position: Int) {
        var currentItem = brandArray[position]
        holder.brandName.setImageResource(currentItem.brandImage)
    }

    override fun getItemCount(): Int {
        return brandArray.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var brandName: ImageView = itemView.findViewById(R.id.tvBrand)
    }
}