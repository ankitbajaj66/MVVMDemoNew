package com.example.mvvmpractice.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmpractice.R
import com.example.mvvmpractice.data.Restaurant
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var restaurantAdaptor: RestaurantAdaptor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()

    }

    private fun initRecyclerView() {
        val listData = ArrayList<Restaurant>()
        val img = "https://i.picsum.photos/id/983/200/300.jpg?hmac=VWTT5PL8-LbE61s9R905V7X4BFr97P-ZFZCzb-Zpj6k"
        val img2 = "https://loremflickr.com/500/500/restaurant"
        listData.add(Restaurant(name = "Name1", type = "type1",
            logo = img, address = "address1"))

        listData.add(Restaurant(name = "Name2", type = "type2",
            logo = img2, address = "address2"))

        listData.add(Restaurant(name = "Name3", type = "type3",
            logo = "https://loremflickr.com/500/500/restaurant", address = "address3"))

        listData.add(Restaurant(name = "Name4", type = "type4",
            logo = "https://loremflickr.com/500/500/restaurant", address = "address4"))

        listData.add(Restaurant(name = "Name5", type = "type5",
            logo = "https://i.picsum.photos/id/276/200/200.jpg?hmac=nEmegloU9V9ajpTC6GdgRRIz-d0EliWd5cQ-F1olB54", address = "address5"))


        recycler_view.apply {
            restaurantAdaptor = RestaurantAdaptor()
            restaurantAdaptor.list = listData
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = restaurantAdaptor
        }

    }
}