package com.example.shoesapp.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.R

class FavoriteFragment : Fragment() {

    lateinit var fvShoesRecyclerView: RecyclerView
    lateinit var fvShoesAdapter: FavoriteAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorite, container, false)

        // Initialize RecyclerView and its adapter
        fvShoesRecyclerView = view.findViewById(R.id.fvshoesRecyclerView)
        val fvshoesList = generateDummyShoesData()
        fvShoesAdapter = FavoriteAdapter(fvshoesList)


        // Set layout manager for the RecyclerView (e.g., LinearLayoutManager, GridLayoutManager)
        fvShoesRecyclerView.layoutManager =
            GridLayoutManager(context, 2, RecyclerView.VERTICAL, false)

        // Set the adapter for the RecyclerView
        fvShoesRecyclerView.adapter = fvShoesAdapter

        // Add your data to the adapter (replace with your actual data)

        fvShoesAdapter.setData(fvshoesList)

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
        ))
        // Add more items as needed
        return fvshoesList


    }

}