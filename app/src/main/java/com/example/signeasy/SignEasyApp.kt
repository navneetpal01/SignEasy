package com.example.signeasy

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRailItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.signeasy.presentation.nvgraph.NavGraph
import com.example.signeasy.presentation.nvgraph.Route
import com.example.signeasy.presentation.nvgraph.SignEasyTabs
import com.example.signeasy.ui.theme.SignEasyTheme
import com.example.signeasy.ui.theme.Smoky_Gray
import com.example.signeasy.ui.theme.System_Bright_Blue
import com.example.signeasy.ui.theme.System_White
import com.example.signeasy.ui.theme.White


@Composable
fun SignEasyApp() {
    SignEasyTheme {

        val tabs = remember {
            SignEasyTabs.values()
        }
        val navController = rememberNavController()

        Box(
            modifier = Modifier.fillMaxSize()
        ){
            Scaffold(
                modifier = Modifier
                    .fillMaxSize(),
                containerColor = System_White,
                bottomBar = {
                    AppBottomBar(navController = navController, tabs = tabs)
                }
            ) { paddingValues ->
                NavGraph(
                    modifier = Modifier
                        .padding(paddingValues),
                    navController = navController,
                    startDestination = Route.HomeScreen.route
                )
            }
            FloatingActionButton(
                modifier = Modifier
                    .size(140.dp)
                    .align(Alignment.BottomCenter)
                    .padding(all = 40.dp),
                onClick = {
                    //TODO
                },
                elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 0.dp),
                shape = CircleShape,
            ) {
                Icon(painter = painterResource(id = R.drawable.add), contentDescription = null)
            }
        }
    }
}

@Composable
fun AppBottomBar(navController: NavHostController, tabs: Array<SignEasyTabs>) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry?.destination?.route ?: SignEasyTabs.HOME.route


    val routes = remember { SignEasyTabs.values().map { it.route } }

    if (currentRoute in routes) {
        NavigationBar(
            modifier = Modifier.windowInsetsBottomHeight(
                WindowInsets.navigationBars.add(WindowInsets(bottom = 56.dp))
            ),
            containerColor = White
        ) {
            tabs.forEach { tab ->
                NavigationBarItem(
                    selected = currentRoute == tab.route,
                    onClick = {
                        if (tab.route != currentRoute) {
                            navController.navigate(tab.route) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }

                        }
                    },
                    icon = {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(id = tab.icon),
                                contentDescription = "null"
                            )
                            Text(text = stringResource(id = tab.title))
                        }
                    },
                    alwaysShowLabel = false,
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = System_Bright_Blue,
                        unselectedIconColor = Smoky_Gray,
                        selectedTextColor = System_Bright_Blue,
                        unselectedTextColor = Smoky_Gray
                    )
                )

            }
        }
    }

}