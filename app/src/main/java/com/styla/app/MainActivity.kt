package com.styla.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.styla.app.ui.navigation.StylaNavGraph
import com.styla.app.ui.theme.StylaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StylaTheme {
                StylaNavGraph()
            }
        }
    }
}