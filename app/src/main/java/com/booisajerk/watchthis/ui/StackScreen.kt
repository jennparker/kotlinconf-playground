package com.booisajerk.watchthis.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.withOpacity
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.utils.VectorImageButton
import com.booisajerk.watchthis.utils.comingSoonMessage

@Composable
fun StackScreen(openDrawer: () -> Unit) {
    Column {
        TopAppBar(
            title = { Text(text = "Stacking ") },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_stack) {
                    openDrawer()
                }
            }
        )
        StackDisplay()
    }
}

@Composable
fun StackDisplay() {
    Column(
        modifier = Spacing(24.dp)
    )
    {
        Text(
            text = "Stacking Demo",
            style = ((+MaterialTheme.typography()).h4).withOpacity(0.40f)
        )
        Text(
            text = "This is an example of how easy it is to manage layout elements",
            style = ((+MaterialTheme.typography()).body2).withOpacity(0.40f)
        )
        HeightSpacer(height = 24.dp)

        comingSoonMessage()
    }
}

//TODO come back to SizedRectangle example...can't find import...check dependencies

@Composable
fun RectangleStack() {
//    Stack {
//        aligned(Alignment.Center) {
//            SizedRectangle(color = Color(0xFF0000FF), width = 300.dp, height = 300.dp)
//        }
//        aligned(Alignment.TopLeft) {
//            SizedRectangle(color = Color(0xFF00FF00), width = 150.dp, height = 150.dp)
//        }
//        aligned(Alignment.BottomRight) {
//            SizedRectangle(color = Color(0xFFFF0000), width = 150.dp, height = 150.dp)
//        }
//    }
}