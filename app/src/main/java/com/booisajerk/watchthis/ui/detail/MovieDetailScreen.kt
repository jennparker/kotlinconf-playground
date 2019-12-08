package com.booisajerk.watchthis.ui.detail

import androidx.compose.Composable
import androidx.ui.layout.Column
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.data.movies
import com.booisajerk.watchthis.model.Movie
import com.booisajerk.watchthis.ui.general.MovieDescription
import com.booisajerk.watchthis.ui.general.MovieTitle
import com.booisajerk.watchthis.utils.Screen
import com.booisajerk.watchthis.utils.VectorImageButton
import com.booisajerk.watchthis.utils.VectorImageFull
import com.booisajerk.watchthis.utils.navigateTo

@Composable
fun MovieDetailScreen(movie: Movie) {
    Column {
        TopAppBar(title = { movie.title },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_arrow_back) {
                    navigateTo(Screen.Home)
                }
            })
        MovieDetailItem(movie = movie)
    }
}

@Composable
private fun MovieDetailItem(movie: Movie) {
    VectorImageFull(id = R.drawable.ic_launcher_foreground)
    MovieTitle(movie.title)
    MovieDescription(movie.description)
}

@Preview
@Composable
fun preview() {
    Column() {
        MovieDetailScreen(movies[0])
    }
}