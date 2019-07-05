package com.example.staggeredgridviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieListStaggeredAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listOfMovies = listOf<MovieModel>();

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MovieListStaggeredViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.list_item_grid_movie,parent,false))
    }

    override fun getItemCount() = listOfMovies.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {

        val movieViewHolder = viewHolder as MovieListStaggeredViewHolder
        movieViewHolder.bindView(listOfMovies[position])
    }

    fun setMovieList(listOfMovies : List<MovieModel>){
        this.listOfMovies = listOfMovies
        notifyDataSetChanged()
    }

}