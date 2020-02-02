package com.booisajerk.watchthis.ui.home

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.layout.Column
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.data.movies
import com.booisajerk.watchthis.ui.general.MovieList
import com.booisajerk.watchthis.utils.VectorImageButton


@Composable
fun HomeScreen() {
    Column {
        TopAppBar(title = { Text(text = "Watch This!") },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_eye) {
                }
            })
        MovieList(movies)
    }
}

@Preview
@Composable
fun preview() {
    HomeScreen()
}
