package com.becker.bottomnavigationcomposeneconaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.becker.bottomnavigationcomposeneconaz.screens.MainScreen
import com.becker.bottomnavigationcomposeneconaz.ui.theme.BottomNavigationComposeNecoNazTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BottomNavigationComposeNecoNazTheme {
                MainScreen()
            }
        }
    }
}