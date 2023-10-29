package com.example.sabrina_hm6_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.sabrina_hm6_3m.databinding.ItemAnimeBinding

class AnimeAdapter (var animeList: ArrayList<AnimeModel>): RecyclerView.Adapter<AnimeAdapter.AnimeHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeHolder {
        return AnimeHolder(ItemAnimeBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int {
        return animeList.size
    }

    override fun onBindViewHolder(holder: AnimeHolder, position: Int) {
        holder.bind(animeList[position])
    }

    inner class AnimeHolder(private var binding: ItemAnimeBinding):ViewHolder(binding.root) {
        fun bind(anime: AnimeModel){
            binding.tvAnimeName.text =anime.animeName
            binding.tvEpisodes.text = anime.episodes
            Glide.with(binding.ivAnimePicture).load(anime.animePicture).into(binding.ivAnimePicture)
        }

    }
}