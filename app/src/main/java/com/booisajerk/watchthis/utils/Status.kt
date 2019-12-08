package com.booisajerk.watchthis.utils

import androidx.compose.Model
import com.booisajerk.watchthis.model.Movie

sealed class Screen {
    object Home : Screen()
    data class MovieDetail(val movie: Movie) : Screen()
}

@Model
object WatchThisStatus {
    var currentScreen: Screen = Screen.Home
}

fun navigateTo(destination: Screen) {
    WatchThisStatus.currentScreen = destination
}