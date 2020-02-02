package com.booisajerk.watchthis.ui.general

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.Padding
import com.booisajerk.watchthis.model.Movie
import com.booisajerk.watchthis.utils.Screen
import com.booisajerk.watchthis.utils.navigateTo

@Composable
fun MovieList(movies: List<Movie>) {
    VerticalScroller {
        Column {
            for (movie in movies) {
                //padding between cards
                Padding(16.dp) {
                    Clickable(onClick = {
                        navigateTo(Screen.MovieDetail(movie))
                    }) {
                        MovieCard(movie)
                    }
                }
            }
        }
    }
}
