package com.booisajerk.watchthis.ui

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TextButtonStyle
import androidx.ui.material.surface.Surface
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.utils.Screen
import com.booisajerk.watchthis.utils.VectorImage
import com.booisajerk.watchthis.utils.WatchThisStatus
import com.booisajerk.watchthis.utils.navigateTo


@Composable
fun AppDrawer(
    currentScreen: Screen,
    closeDrawer: () -> Unit
) {
    Column(modifier = Expanded) {
        HeightSpacer(height = 24.dp)
        Row(modifier = Spacing(16.dp)) {
            VectorImage(
                id = R.drawable.ic_child,
                tint = (+MaterialTheme.colors()).primary
            )
            WidthSpacer(width = 16.dp)
            Text(
                text = "Playground",
                style = TextStyle((+MaterialTheme.colors()).primary)
            )
        }
        Divider(color = Color(0x14333333))

        DrawerButton(
            icon = R.drawable.ic_home,
            label = "Home",
            isSelected = currentScreen == Screen.Landing
        ) {
            navigateTo(Screen.Landing)
            closeDrawer()
        }

        DrawerButton(
            icon = R.drawable.ic_movie,
            label = "Movies",
            isSelected = currentScreen == Screen.MovieList
        ) {
            navigateTo(Screen.MovieList)
            closeDrawer()
        }

        DrawerButton(
            icon = R.drawable.ic_plus_1,
            label = "Counter",
            isSelected = currentScreen == Screen.Counter
        ) {
            navigateTo(Screen.Counter)
            closeDrawer()
        }

        DrawerButton(
            icon = R.drawable.ic_stack,
            label = "Stacking",
            isSelected = currentScreen == Screen.Stack
        ) {
            navigateTo(Screen.Stack)
            closeDrawer()
        }
    }
}


@Composable
private fun DrawerButton(
    modifier: Modifier = Modifier.None,
    @DrawableRes icon: Int,
    label: String,
    isSelected: Boolean,
    action: () -> Unit
) {
    val colors = +MaterialTheme.colors()
    val textIconColor = if (isSelected) {
        colors.primary
    } else {
        colors.onSurface.copy(alpha = 0.6f)
    }
    val backgroundColor = if (isSelected) {
        colors.primary.copy(alpha = 0.12f)
    } else {
        colors.surface
    }


    Surface(
        modifier = modifier wraps Spacing(left = 8.dp, top = 8.dp, right = 8.dp),
        color = backgroundColor,
        shape = RoundedCornerShape(4.dp)
    ) {
        Button(onClick = action, style = TextButtonStyle()) {
            Row {
                VectorImage(
                    modifier = Gravity.Center,
                    id = icon,
                    tint = textIconColor
                )
                WidthSpacer(16.dp)
                Text(
                    text = label,
                    style = (+MaterialTheme.typography()).body2.copy(
                        color = textIconColor
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun preview() {
    AppDrawer(
        currentScreen = WatchThisStatus.currentScreen,
        closeDrawer = { }
    )
}