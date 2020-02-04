package com.booisajerk.watchthis.ui.movie

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.layout.Column
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.data.movies
import com.booisajerk.watchthis.utils.VectorImageButton

@Composable
fun MovieListScreen(openDrawer: () -> Unit) {
    Column {
        TopAppBar(
            title = { Text(text = "Movie List") },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_movie) {
                    openDrawer()
                }
            }
        )
        MovieList(movies)
    }
}

@Preview
@Composable
fun previewMovieListScreen() {
    MovieListScreen { }
}