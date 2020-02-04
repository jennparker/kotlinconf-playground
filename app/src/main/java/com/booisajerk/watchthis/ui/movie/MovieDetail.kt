package com.booisajerk.watchthis.ui.movie

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.dp
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Spacing
import androidx.ui.material.surface.Surface
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.data.movies
import com.booisajerk.watchthis.model.Movie

@Composable
fun MovieDetail(movie: Movie) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
        val image = +vectorResource(movie.moviePoster)
        Column {
            Container(expanded = true, height = 144.dp) {
                DrawVector(image)
            }

            Column(modifier = Spacing(16.dp)) {
                MovieTitleLarge(title = movie.title)
                MovieYear(movie.year)
                MovieGenre(movie.genre)
                MovieLanguage(movie.language)
                MovieDescription(movie.longDescription)
            }
        }
    }
}

@Composable
@Preview
fun DefaultMovieDetail() {
    MovieDetail(movie = movies[0])
}