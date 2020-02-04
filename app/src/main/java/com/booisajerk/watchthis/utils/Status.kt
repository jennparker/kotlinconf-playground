package com.booisajerk.watchthis.utils

import androidx.compose.Model
import com.booisajerk.watchthis.model.Movie

sealed class Screen {
    object Landing : Screen()
    object Counter : Screen()
    object MovieList : Screen()
    object Stack : Screen()
    data class MovieDetail(val movie: Movie) : Screen()
}

@Model
object WatchThisStatus {
    var currentScreen: Screen = Screen.Landing
}

fun navigateTo(destination: Screen) {
    WatchThisStatus.currentScreen = destination
}