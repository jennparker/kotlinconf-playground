package com.booisajerk.watchthis.utils

import android.content.Context
import android.content.Intent
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import androidx.ui.material.withOpacity
import com.booisajerk.watchthis.model.Movie

@Composable
fun comingSoonMessage() {
    Column {
        Text(
            text = "Coming Soon!",
            style = ((+MaterialTheme.typography()).h5).withOpacity(0.40f)
        )
        Text(
            text = "Get Excited!!",
            style = ((+MaterialTheme.typography()).h3).withOpacity(0.40f)
        )
    }
}

//TODO add this
private fun share(movie: Movie, context: Context) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_TITLE, movie.title)
        putExtra(Intent.EXTRA_TEXT, movie.description)
    }
    context.startActivity(Intent.createChooser(intent, "Share movie"))
}