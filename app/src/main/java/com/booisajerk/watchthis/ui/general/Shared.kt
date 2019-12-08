package com.booisajerk.watchthis.ui.general

import androidx.compose.Composable
import androidx.ui.core.Opacity
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.Spacing
import androidx.ui.material.Divider

@Composable
fun ItemDivider() {
    Opacity(0.50f) {
        Divider(
            modifier = Spacing(left = 14.dp, right = 14.dp),
            color = Color.Gray
        )
    }
}