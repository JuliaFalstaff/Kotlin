package com.example.myapplication

import android.content.ContentValues.TAG
import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.sql.DriverManager.println
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var buttonChoose: Button
    private lateinit var textViewList: TextView
    private lateinit var textViewList2: TextView
    private val TAG : String = "Movie"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonChoose = findViewById(R.id.button)
        buttonChoose.setOnClickListener {
            Toast.makeText(applicationContext, "Choose your favourite movie!", Toast.LENGTH_SHORT)
                    .show()
        }

        //data class and copy
        val movie1 = Movie("Twin Peaks", 1990)
        val movie2 = movie1.copy(year = 1991)

        textViewList = findViewById(R.id.textViewList)
        textViewList.setText(movie1.title + " " + movie1.year)
        textViewList.setOnClickListener {
            Toast.makeText(applicationContext, "First movie of  Data Class", Toast.LENGTH_SHORT)
                    .show()
        }

        textViewList2 = findViewById(R.id.textViewList2)
        textViewList2.setText(movie2.title + " " + movie2.year)
        textViewList2.setOnClickListener {
            Toast.makeText(applicationContext, "Copy of first Twin Peaks with another year", Toast.LENGTH_SHORT)
                    .show()
        }


        val movieList = ArrayList<Movie>()
        movieList.add(Movie("Twin Peaks", 1990))
        movieList.add(Movie("Lost in Translation", 2003))
        movieList.add(Movie("Coffee and Cigarettes", 2003))
        movieList.add(Movie("Pulp Fiction", 1994))
        movieList.add(Movie("The Irishman", 2019))
        movieList.add(Movie("Manhattan", 1979))

        //when
        val movie = movieList[5]
        val director: String = when (movie.title) {
            "Manhattan" -> {
                "Woody Allen"
            }
            else -> {
                "Не определен"
            }
        }
        Log.i("Show director", director.toString())

        //цикл
        for (movie in movieList) {
            Log.i("Show movieList", movie.toString())
        }
    }
}




