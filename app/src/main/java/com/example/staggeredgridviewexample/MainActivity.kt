package com.example.staggeredgridviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView(){
        recyclerViewMovies.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerViewMovies.addItemDecoration(GridItemDecoration(10,2))

        val movieListViewAdapter = MovieListStaggeredAdapter()
        recyclerViewMovies.adapter = movieListViewAdapter
        movieListViewAdapter.setMovieList(generateDummyData())
    }

    fun generateDummyData() : List<MovieModel>{
        var listOfMovie = mutableListOf<MovieModel>()

        var movieModel = MovieModel(1,"Avengers",500,"16 Feb 2018", R.drawable.ic_launcher_background)
        listOfMovie.add(movieModel)

        movieModel = MovieModel(2,"Avengers: Age of Ultron",400,"16 Feb 2018", R.drawable.ic_launcher_background)
        listOfMovie.add(movieModel)

        movieModel = MovieModel(3, "Iron Man 3", 550, "17 April 2018", R.drawable.ic_launcher_background)
        listOfMovie.add(movieModel)

        movieModel = MovieModel(4, "Avengers: Infinity War", 1500, "15 Jan 2018", R.drawable.ic_launcher_background)
        listOfMovie.add(movieModel)

        movieModel = MovieModel(5, "Thor: Ragnarok", 200, "17 March 2018", R.drawable.ic_launcher_background)
        listOfMovie.add(movieModel)

        movieModel = MovieModel(6, "Black Panther", 250, "17 May 2018", R.drawable.ic_launcher_background)
        listOfMovie.add(movieModel)

        movieModel = MovieModel(7, "Logan", 320, "17 Dec 2018", R.drawable.ic_launcher_background)
        listOfMovie.add(movieModel)


        return listOfMovie
    }
}
