package com.booisajerk.watchthis.ui.general

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.withOpacity

@Composable
fun MovieTitle(title: String) {
    Text(
        modifier = Spacing(0.dp, 12.dp, 12.dp, 0.dp),
        text = title,
        style = ((+MaterialTheme.typography()).h5).withOpacity(0.75f)
    )
}

@Composable
fun MovieDescription(description: String) {
    Text(
        text = description,
        style = ((+MaterialTheme.typography()).body1).withOpacity(0.50f)
    )
}

@Composable
fun MovieGenre(genre: String) {
    Text(
        text = genre,
        style = ((+MaterialTheme.typography()).caption).withOpacity(0.40f)
    )
}

@Composable
fun MovieYear(year: String) {
    Text(
        text = year,
        style = ((+MaterialTheme.typography()).caption).withOpacity(0.40f)
    )
}

