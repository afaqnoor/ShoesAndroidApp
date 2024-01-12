package com.example.shoesapp.shoes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.R

// HomeFragment.kt
class HomeFragment : Fragment() {

    lateinit var shoesRecyclerView: RecyclerView
    lateinit var shoesAdapter: ShoesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Initialize RecyclerView and its adapter
        shoesRecyclerView = view.findViewById(R.id.shoesRecyclerView)
        val shoesList = generateDummyShoesData()
        shoesAdapter = ShoesAdapter(shoesList)


        // Set layout manager for the RecyclerView (e.g., LinearLayoutManager, GridLayoutManager)
        shoesRecyclerView.layoutManager =
            GridLayoutManager(context, 2, RecyclerView.VERTICAL, false)

        // Set the adapter for the RecyclerView
        shoesRecyclerView.adapter = shoesAdapter

        // Add your data to the adapter (replace with your actual data)

        shoesAdapter.setData(shoesList)

        return view
    }

    private fun generateDummyShoesData(): ArrayList<ShoesItem> {
        // Replace this with your actual data source
        val shoesList = ArrayList<ShoesItem>()
        shoesList.add(
            ShoesItem(
                "Casual Brown",
                "Lorem ipsum is a placeholder text commonly used",
                "$23.09",
                R.drawable.b
            )
        )
        shoesList.add(
            ShoesItem(
                "Casual Blue",
                "Lorem ipsum is a placeholder text commonly used",
                "$12.09",
                R.drawable.blue
            )
        )
        shoesList.add(
            ShoesItem(
                "Sports Leather",
                "Lorem ipsum is a placeholder text commonly used",
                "$11.90",
                R.drawable.leather
            )
        )
        shoesList.add(
            ShoesItem(
                "Sports ride white",
                "Lorem ipsum is a placeholder text commonly used",
                "$16.90",
                R.drawable.ride
            )
        )
        shoesList.add(
            ShoesItem(
                "Casual Brown",
                "Lorem ipsum is a placeholder text commonly used",
                "$23.09",
                R.drawable.b
            )
        )
        shoesList.add(
            ShoesItem(
                "Casual Blue",
                "Lorem ipsum is a placeholder text commonly used",
                "$12.09",
                R.drawable.blue
            )
        )
        shoesList.add(
            ShoesItem(
                "Sports Leather",
                "Lorem ipsum is a placeholder text commonly used",
                "$11.90",
                R.drawable.leather
            )
        )
        shoesList.add(
            ShoesItem(
                "Sports ride white",
                "Lorem ipsum is a placeholder text commonly used",
                "$16.90",
                R.drawable.ride
            )
        )
        shoesList.add(
            ShoesItem(
                "Casual Brown",
                "Lorem ipsum is a placeholder text commonly used",
                "$23.09",
                R.drawable.b
            )
        )
        shoesList.add(
            ShoesItem(
                "Casual Blue",
                "Lorem ipsum is a placeholder text commonly used",
                "$12.09",
                R.drawable.blue
            )
        )
        shoesList.add(
            ShoesItem(
                "Sports Leather",
                "Lorem ipsum is a placeholder text commonly used",
                "$11.90",
                R.drawable.leather
            )
        )
        shoesList.add(
            ShoesItem(
                "Sports ride white",
                "Lorem ipsum is a placeholder text commonly used",
                "$16.90",
                R.drawable.ride
            )
        )
        shoesList.add(
            ShoesItem(
                "Casual Brown",
                "Lorem ipsum is a placeholder text commonly used",
                "$23.09",
                R.drawable.b
            )
        )
        shoesList.add(
            ShoesItem(
                "Casual Blue",
                "Lorem ipsum is a placeholder text commonly used",
                "$12.09",
                R.drawable.blue
            )
        )
        shoesList.add(
            ShoesItem(
                "Sports Leather",
                "Lorem ipsum is a placeholder text commonly used",
                "$11.90",
                R.drawable.leather
            )
        )
        shoesList.add(
            ShoesItem(
                "Sports ride white",
                "Lorem ipsum is a placeholder text commonly used",
                "$16.90",
                R.drawable.ride
            )
        )
        // Add more items as needed
        return shoesList


    }

}
