package com.example.signeasy

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.signeasy.presentation.nvgraph.NavGraph
import com.example.signeasy.presentation.nvgraph.Route
import com.example.signeasy.ui.theme.SignEasyTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                Color.TRANSPARENT,
                Color.TRANSPARENT
            )
        )
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

}