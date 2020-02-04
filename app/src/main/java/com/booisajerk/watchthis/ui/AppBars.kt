package com.booisajerk.watchthis.ui

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.utils.Screen
import com.booisajerk.watchthis.utils.VectorImageButton
import com.booisajerk.watchthis.utils.navigateTo

@Composable
fun BackAppBar(appBarTitle: String) {
    TopAppBar(
        title = {
            Text(text = appBarTitle)
        },
        navigationIcon = {
            VectorImageButton(R.drawable.ic_arrow_back) {
                navigateTo(Screen.MovieList)
            }
        })
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        BackAppBar(appBarTitle = "test")
    }
}


