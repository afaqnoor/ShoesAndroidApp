package com.example.shoesapp.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.R
import com.example.shoesapp.favorite.FavoriteAdapter
import com.example.shoesapp.favorite.FavoriteItem

class ShoppingCartFragment : Fragment() {

    lateinit var shoppingCartRecyclerView: RecyclerView
    lateinit var shoppingCartAdapter: CartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shopping_cart, container, false)

        // Initialize RecyclerView and its adapter
        shoppingCartRecyclerView = view.findViewById(R.id.cartRecyclerView)
        val fvshoesList = generateDummyShoesData()
        shoppingCartAdapter = CartAdapter(fvshoesList)


        // Set layout manager for the RecyclerView (e.g., LinearLayoutManager, GridLayoutManager)
        shoppingCartRecyclerView.layoutManager =
            GridLayoutManager(context, 2, RecyclerView.VERTICAL, false)

        // Set the adapter for the RecyclerView
        shoppingCartRecyclerView.adapter = shoppingCartAdapter

        // Add your data to the adapter (replace with your actual data)

        shoppingCartAdapter.setData(fvshoesList)

        return view
    }

    private fun generateDummyShoesData(): ArrayList<FavoriteItem> {
        // Replace this with your actual data source
        val fvshoesList = ArrayList<FavoriteItem>()
        fvshoesList.add(
            FavoriteItem(
                "Casual Blue",
                "Lorem ipsum is a placeholder text commonly used",
                "$12.09",
                R.drawable.blue
            )
        )
        fvshoesList.add(
            FavoriteItem(
                "Sports ride white",
                "Lorem ipsum is a placeholder text commonly used",
                "$16.90",
                R.drawable.ride
            )
        )
        fvshoesList.add(
            FavoriteItem(
                "Sports ride white",
                "Lorem ipsum is a placeholder text commonly used",
                "$16.90",
                R.drawable.w
            )
        )
        // Add more items as needed
        return fvshoesList

    }
}