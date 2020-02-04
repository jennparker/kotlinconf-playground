package com.booisajerk.watchthis.ui

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.animation.Crossfade
import androidx.ui.material.DrawerState
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ModalDrawerLayout
import androidx.ui.material.surface.Surface
import com.booisajerk.watchthis.ui.movie.MovieDetailScreen
import com.booisajerk.watchthis.ui.movie.MovieListScreen
import com.booisajerk.watchthis.utils.Screen
import com.booisajerk.watchthis.utils.WatchThisStatus

@Composable
fun WatchThisApp() {

    val (drawerState, onDrawerStateChange) = +state { DrawerState.Closed }

    MaterialTheme()
    {
        ModalDrawerLayout(
            drawerState = drawerState,
            onStateChange = onDrawerStateChange,
            gesturesEnabled = drawerState == DrawerState.Opened,
            drawerContent = {
                AppDrawer(
                    currentScreen = WatchThisStatus.currentScreen,
                    closeDrawer = { onDrawerStateChange(DrawerState.Closed) }
                )
            },
            bodyContent = { AppContent { onDrawerStateChange(DrawerState.Opened) } }
        )
    }
}

@Composable
private fun AppContent(openDrawer: () -> Unit) {
    Crossfade(WatchThisStatus.currentScreen) { screen ->
        Surface(color = (+MaterialTheme.colors()).background) {
            when (screen) {
                is Screen.Landing -> LandingScreen { openDrawer() }
                is Screen.MovieList -> MovieListScreen { openDrawer() }
                is Screen.MovieDetail -> MovieDetailScreen(
                    movie = screen.movie
                )
                is Screen.Counter -> CounterScreen { openDrawer() }
                is Screen.Stack -> StackScreen { openDrawer() }
            }
        }
    }
}
