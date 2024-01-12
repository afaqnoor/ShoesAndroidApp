package com.example.shoesapp.cart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.R
import com.example.shoesapp.favorite.FavoriteItem
import com.google.android.material.imageview.ShapeableImageView

class CartAdapter(private var cartShoesArray: ArrayList<CartItem>) :
    RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartAdapter.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.shopping_cart_item, parent, false)
        return ViewHolder(itemView)
    }

    private var cartList: List<CartItem> = emptyList()

    fun setData(data: List<CartItem>) {
        this.cartList = data
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: CartAdapter.ViewHolder, position: Int) {
        var currentItem = cartShoesArray[position]
        holder.crtName.text = currentItem.cartName
        holder.crtPrice.text = currentItem.cartPrice
        holder.crtQuantity.text = currentItem.cartQuantity
        holder.crtImage.setImageResource(currentItem.cartImage)
        holder.crtDelete.setImageResource(currentItem.cartDelImage)
    }

    override fun getItemCount(): Int {
        return cartShoesArray.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var crtName: TextView = itemView.findViewById(R.id.cartTVName)
        var crtPrice: TextView = itemView.findViewById(R.id.cartTVPrice)
        var crtQuantity: TextView = itemView.findViewById(R.id.cartQuantity)
        var crtDelete: ImageView = itemView.findViewById(R.id.delimageView)
        var crtImage: ShapeableImageView = itemView.findViewById(R.id.cartImage)
    }
}