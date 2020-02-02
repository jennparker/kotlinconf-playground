package com.booisajerk.watchthis.model

import androidx.annotation.DrawableRes

data class Movie(
    @DrawableRes val moviePoster: Int,
    val title: String,
    val description: String,
    val longDescription: String,
    val year: String,
    val genre: Genre,
    val language: Language
)

enum class Genre {
    Animated,
    Comedy,
    Drama,
    Fantasy,
    Horror,
}

enum class Language {
    Arabic,
    Chinese,
    English,
    French,
    German,
}
