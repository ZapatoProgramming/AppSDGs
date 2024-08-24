package com.example.eco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.eco.components.CenteredCardExample
import com.example.eco.ui.theme.EcoTheme

class MainActivity : ComponentActivity() {

    private var hijo by mutableStateOf(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcoTheme {
                if (hijo) {
                    CenteredCardExample(
                        header = "Hijo",
                        onCardClick = onClickCardExample
                    )
                } else {
                    CenteredCardExample(
                        header = "Padre",
                        onCardClick = onClickCardExample
                    )
                }
            }
        }
    }

    private val onClickCardExample: () -> Unit = {
        hijo = !hijo
    }
}




