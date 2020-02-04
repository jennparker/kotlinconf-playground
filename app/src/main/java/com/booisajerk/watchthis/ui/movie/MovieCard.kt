package com.booisajerk.watchthis.ui.movie

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.dp
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.data.movies
import com.booisajerk.watchthis.model.Movie

@Composable
fun MovieCard(movie: Movie) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
        val image = +vectorResource(movie.moviePoster)
        Column {
            Container(expanded = true, height = 144.dp) {
                DrawVector(image)
            }
            Column(modifier = Spacing(16.dp)) {
                MovieTitle(title = movie.title)

                MovieDescription(
                    movie.description
                )

                Row(modifier = Spacing(0.dp, 4.dp, 16.dp, 0.dp)) {
                    MovieGenre(movie.genre)
                    WidthSpacer(width = 24.dp)
                    MovieYear(movie.year)
                }
            }
        }
    }
}

@Composable
@Preview
fun DefaultMovieCard() {
    MaterialTheme {
        MovieCard(movies[0])
    }
}