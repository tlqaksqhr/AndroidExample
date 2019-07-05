package com.example.staggeredgridviewexample

data class MovieModel(
    var movieId: Int,
    var movieTitle: String,
    var movieViews: Int,
    var releaseDate: String,
    var moviePicture: Int?
) {
    constructor() : this(0,"",0,"",null)
}