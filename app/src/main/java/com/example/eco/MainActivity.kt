package com.example.eco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.eco.components.CenteredCardExample
import com.example.eco.ui.theme.EcoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcoTheme {
                CenteredCardExample()
            }
        }
    }
}




