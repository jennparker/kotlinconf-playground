package com.booisajerk.watchthis.ui

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Spacing
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.withOpacity
import androidx.ui.tooling.preview.Preview
import com.booisajerk.watchthis.R
import com.booisajerk.watchthis.utils.VectorImageButton

@Composable
fun CounterScreen(openDrawer: () -> Unit) {
    Column {
        TopAppBar(
            title = { Text(text = "Counter state ") },
            navigationIcon = {
                VectorImageButton(R.drawable.ic_plus_1) {
                    openDrawer()
                }
            }
        )
        Counter()
    }
}

@Composable
fun Counter() {
    val amount = +state { 0 }

    Column(
        modifier = Spacing(24.dp)
    )
    {
        Text(
            text = "Counter Demo",
            style = ((+MaterialTheme.typography()).h4).withOpacity(0.40f)
        )
        Text(
            text = "This is super cool because Compose has easy to use tools that allow you to " +
                    "recompose your composable on state change. By using +state in the composable, " +
                    "the composable will automatically be recomposed anytime the state value changes.",
            style = ((+MaterialTheme.typography()).body2).withOpacity(0.40f)
        )

        HeightSpacer(height = 24.dp)
        Button(text = "Add", modifier = Spacing(8.dp), onClick = { amount.value++ })
        Button(text = "Subtract", modifier = Spacing(8.dp), onClick = { amount.value-- })
        Text(
            text = "Behold!",
            style = ((+MaterialTheme.typography()).h6).withOpacity(0.40f),
            modifier = Spacing(4.dp)
        )
        Text(
            text = "Click counts: ${amount.value}",
            style = ((+MaterialTheme.typography()).h6).withOpacity(0.40f),
            modifier = Spacing(4.dp)
        )
    }
}

@Preview
@Composable
fun previewCounter() {
    CounterScreen {}
}
