package com.booisajerk.watchthis.model

data class Movie(
    val title: String,
    val description: String,
    val year: String,
    val genre: Genre,
    val poster: Int
)

enum class Genre {
    Action,
    Animated,
    Comedy,
    Drama,
    Fantasy,
    Horror,
    Thriller
}
