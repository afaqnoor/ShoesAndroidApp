package com.example.shoesapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.brand.BrandAdapter
import com.example.shoesapp.brand.BrandItem
import com.example.shoesapp.cart.ShoppingCartFragment
import com.example.shoesapp.databinding.ActivityMainBinding
import com.example.shoesapp.favorite.FavoriteFragment
import com.example.shoesapp.shoes.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var brandRecyclerView: RecyclerView
    lateinit var brandnewArray : ArrayList<BrandItem>
    private val homeFragment = HomeFragment()
    private val favoriteFragment = FavoriteFragment()
    private val shoppingCartFragment = ShoppingCartFragment()
    private val accountFragment = AccountFragment()
    private lateinit var binding: ActivityMainBinding


    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.idHome -> {
                    replaceFragment(homeFragment)
                    showToast("Home Clicked")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.idFavorite -> {
                    replaceFragment(favoriteFragment)
                    showToast("Favorite Clicked")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.idShoppingCart -> {
                    replaceFragment(shoppingCartFragment)
                    showToast("Shopping Cart Clicked")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.idAccount -> {
                    replaceFragment(accountFragment)
                    showToast("Account Clicked")
                    return@OnNavigationItemSelectedListener true
                }
                else -> false
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        brandRecyclerView = findViewById(R.id.brandRecyclerView)

        val brandImageArray = arrayOf(
            R.drawable.bata,
            R.drawable.a,
            R.drawable.n,
            R.drawable.p,
            R.drawable.w,
            R.drawable.bata,
            R.drawable.a,
            R.drawable.n,
            R.drawable.p,
            R.drawable.w,
        )

        brandRecyclerView.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                true
            )
        )
        brandnewArray = arrayListOf<BrandItem>()

        for (index in brandImageArray.indices){
            val brand = BrandItem(brandImageArray[index])
            brandnewArray.add(brand)
        }

        brandRecyclerView.adapter = BrandAdapter(brandnewArray,this)

        // DropDown Button
        val spinner = findViewById<Spinner>(R.id.spinner)

        val spinnerItems = resources.getStringArray(R.array.spinner_items)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerItems)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = spinnerItems[position]
                Toast.makeText(this@MainActivity, "Selected item: $selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Do nothing
            }
        }

        // Bottom Navigation Bar
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        // Set the default fragment
        replaceFragment(homeFragment)
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}