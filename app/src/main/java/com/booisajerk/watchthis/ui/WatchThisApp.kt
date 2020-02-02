package com.booisajerk.watchthis.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.animation.Crossfade
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.ui.detail.MovieDetailScreen
import com.booisajerk.watchthis.ui.home.HomeScreen
import com.booisajerk.watchthis.utils.Screen
import com.booisajerk.watchthis.utils.WatchThisStatus

@Composable
fun WatchThisApp() {
    AppContent()
}

@Composable
private fun AppContent() {
    Crossfade(WatchThisStatus.currentScreen) { screen: Screen ->
        Surface(color = (+MaterialTheme.colors()).background) {
            when (screen) {
                is Screen.Home -> HomeScreen()
                is Screen.MovieDetail -> MovieDetailScreen(movie = screen.movie)
            }
        }
    }
}

@Preview
@Composable
fun preview() {
    Column {
        WatchThisApp()
    }
}
