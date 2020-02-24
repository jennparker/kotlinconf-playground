package com.booisajerk.watchthis.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Spacing
import androidx.ui.material.AppBarIcon
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import com.booisajerk.watchthis.R

@Composable
fun LandingScreen(openDrawer: () -> Unit) {
    Column {
        TopAppBar(
            title = { Text(text = "Compose Playground") },
            navigationIcon = {
                AppBarIcon(
                    icon = +imageResource(R.drawable.ic_menu_white)
                ) {
                    openDrawer()
                }
            }
        )
        ComposeDescription()
    }
}

@Composable
fun ComposeDescription() {
    HeightSpacer(height = 24.dp)
    Text(
        text = "This sample app is designed to show some of the cool features in the forthcoming Jetpack " +
                "Compose. Use the app drawer to explore.",
        modifier = Spacing(24.dp),
        style = ((+MaterialTheme.typography()).h6).withOpacity(0.75f)
    )
}