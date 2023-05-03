package com.julio.animezone

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import androidx.lifecycle.viewModelScope

class AnimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val imageView: ImageView = itemView.findViewById(R.id.imageView)
    private val titleTv: TextView = itemView.findViewById(R.id.titleTv)

    fun bind(anime: Anime) {
        titleTv.text = anime.title
        Glide.with(itemView.context)
            .load(anime.imageUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(imageView)
    }

}