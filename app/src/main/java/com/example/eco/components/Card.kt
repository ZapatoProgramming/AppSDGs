package com.example.eco.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CenteredCardExample(header: String, onCardClick: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter,
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            onClick = onCardClick,
            modifier = Modifier
                .width(400.dp)
                .wrapContentHeight()
                .padding(top = 20.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = header,
                    fontSize = 24.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Text(
                    text = "Subheader",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Text(
                    text = "Text",
                    fontSize = 14.sp,
                    fontFamily = FontFamily.SansSerif,
                )
            }
        }
    }
}