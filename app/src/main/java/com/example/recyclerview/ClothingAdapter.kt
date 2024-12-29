package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClothingAdapter(private val clothingList: List<ClothingItem>) :
    RecyclerView.Adapter<ClothingAdapter.ClothingViewHolder>() {

    class ClothingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val titleView: TextView = itemView.findViewById(R.id.tvTitle)
        val descriptionView: TextView = itemView.findViewById(R.id.tvDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothingViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_clothing, parent, false)
        return ClothingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClothingViewHolder, position: Int) {
        val item = clothingList[position]
        holder.imageView.setImageResource(item.image)
        holder.titleView.text = item.title
        holder.descriptionView.text = item.description
    }

    override fun getItemCount() = clothingList.size
}