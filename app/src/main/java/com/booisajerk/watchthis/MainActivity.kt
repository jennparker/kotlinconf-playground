package com.booisajerk.watchthis

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.MaterialTypography
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content("KotlinConf")
        }
    }
}

@Composable
fun Content(name: String) {
    Column(
        modifier = Spacing(16.dp)
    ) {
        Center {
            PageTitle(pageTitle = "New Movie")
        }
        MovieDetails()
    }
}

@Composable
fun PageTitle(pageTitle: String) {
    val typography = MaterialTypography()

    Text(
        text = "Hello, $pageTitle!",
        style = typography.h4
    )
}

@Composable
fun MovieDetails() {
    MaterialTheme {
        val typography = MaterialTypography()
        Column(
            modifier = Spacing(16.dp)
        ) {
            MovieTitle("Blue Velvet")
            HeightSpacer(4.dp)
            MovieDescription("Blah, blah, details about blah, words and words and blah blah")
            HeightSpacer(4.dp)
            MovieGenre("Drama")
            MovieYear("1987")
        }
    }
}

@Composable
fun MovieTitle(title: String) {
    val typography = MaterialTypography()
    Text(
        text = title,
        style = typography.h5
    )
}

@Composable
fun MovieDescription(description: String) {
    val typography = MaterialTypography()
    Text(
        text = description,
        style = typography.subtitle1
    )
}

@Composable
fun MovieGenre(genre: String) {
    val typography = MaterialTypography()
    Text(
        text = genre,
        style = typography.body2
    )
}

@Composable
fun MovieYear(year: String) {
    val typography = MaterialTypography()
    Text(
        text = year,
        style = typography.caption
    )
}

@Preview
@Composable
fun DefaultPreview() {
    Column() {
        Content("Watch This")
    }
}
