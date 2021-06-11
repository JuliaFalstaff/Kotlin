package com.example.myapplication

import java.sql.DriverManager.println
import java.util.*


data class Movie(val title: String, val year: Int)

    private var movieList: List<Movie> = ArrayList<Movie>()

    fun getMovieByIndex(index: Int): Movie {
        return movieList[index]
    }

    fun getSize(): Int {
        return movieList.size
    }






