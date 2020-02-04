package com.booisajerk.watchthis.ui.movie

import androidx.compose.Composable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import com.booisajerk.watchthis.model.Movie
import com.booisajerk.watchthis.ui.BackAppBar

@Composable
fun MovieDetailScreen(movie: Movie) {

    Column {
        BackAppBar(movie.title)
        VerticalScroller {
            MovieDetail(movie = movie)
        }
    }
}