package com.example.mvvmpractice.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmpractice.R
import com.example.mvvmpractice.data.Restaurant
import kotlinx.android.synthetic.main.restaurant_item.view.*

class RestaurantAdaptor : RecyclerView.Adapter<RestaurantAdaptor.RestaurantViewHolder>() {

    var list: List<Restaurant> = mutableListOf<Restaurant>()

    class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val logo = itemView.image_view_logo
        val name = itemView.text_view_name
        val type = itemView.text_view_type
        val address = itemView.text_view_address


        fun bindViewHolder(data: Restaurant) {
            Glide.with(itemView).load(data.logo).into(itemView.image_view_logo)
            name.text = data.name
            type.text = data.type
            address.text = data.address
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.restaurant_item, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val item = list[position]
        holder.bindViewHolder(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}