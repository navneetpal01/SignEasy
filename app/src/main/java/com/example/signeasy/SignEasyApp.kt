package com.example.signeasy

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.signeasy.presentation.nvgraph.NavGraph
import com.example.signeasy.presentation.nvgraph.SignEasyTabs
import com.example.signeasy.ui.theme.SignEasyTheme


@Composable
fun SignEasyApp() {
    SignEasyTheme {

        val tabs = remember {
            SignEasyTabs.values()
        }
        val navController = rememberNavController()

        Scaffold(
            containerColor = Color.Cyan,
            bottomBar = {

            }
        ){paddingValues ->
            NavGraph(
                modifier = Modifier
                    .padding(paddingValues),
                navController = navController
            )

        }
    }
}
