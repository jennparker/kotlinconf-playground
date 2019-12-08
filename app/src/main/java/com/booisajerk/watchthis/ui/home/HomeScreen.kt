package com.booisajerk.watchthis.ui.home

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.*
import androidx.ui.material.TopAppBar
import androidx.ui.material.ripple.Ripple
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.data.movies
import com.booisajerk.watchthis.model.Movie
import com.booisajerk.watchthis.ui.general.*
import com.booisajerk.watchthis.utils.Screen
import com.booisajerk.watchthis.utils.VectorImageButton
import com.booisajerk.watchthis.utils.VectorImageThumb
import com.booisajerk.watchthis.utils.navigateTo


@Composable
fun HomeScreen() {
    Column {
        TopAppBar(title = { Text(text = "Watch This!") },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_eye) {
                }
            })

        VerticalScroller(modifier = Flexible(1f)) {
            Column {
                MovieSummaryList(movies)
            }
        }
    }
}

@Composable
private fun MovieSummaryList(movies: List<Movie>) {
    movies.forEach { movie ->
        MovieSummaryItem(movie)
        ItemDivider()
    }
}


@Composable
fun MovieSummaryItem(movie: Movie) {
    Ripple(bounded = true) {
        Clickable(onClick = {
            navigateTo(
                Screen.MovieDetail(
                    movie
                )
            )
        }) {
            Row(modifier = Spacing(0.dp, 16.dp, 0.dp, 16.dp)) {
                VectorImageThumb(id = R.drawable.ic_launcher_foreground)
                Column() {
                    MovieTitle(movie.title)
                    HeightSpacer(4.dp)
                    MovieDescription(
                        movie.description
                    )
                    //    HeightSpacer(4.dp)
                    Row(modifier = Spacing(0.dp, 4.dp, 16.dp, 0.dp)) {
                        MovieGenre(movie.genre.toString())
                        WidthSpacer(width = 24.dp)
                        MovieYear(movie.year)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun preview() {
    Column {
        HomeScreen()
    }
}
