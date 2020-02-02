package com.booisajerk.watchthis.ui.detail

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.material.TopAppBar
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.model.Movie
import com.booisajerk.watchthis.ui.general.MovieDetail
import com.booisajerk.watchthis.utils.Screen
import com.booisajerk.watchthis.utils.VectorImageButton
import com.booisajerk.watchthis.utils.navigateTo

@Composable
fun MovieDetailScreen(movie: Movie) {

    Column {
        TopAppBar(title = { Text(text = movie.title) },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_arrow_back) {
                    navigateTo(Screen.Home)
                }
            })
        VerticalScroller {
            MovieDetail(movie = movie)
        }
    }
}