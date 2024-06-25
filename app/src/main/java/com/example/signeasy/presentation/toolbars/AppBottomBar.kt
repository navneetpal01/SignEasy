package com.example.signeasy.presentation.toolbars

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.signeasy.presentation.nvgraph.SignEasyTabs
import com.example.signeasy.ui.theme.Smoky_Gray
import com.example.signeasy.ui.theme.System_Bright_Blue
import com.example.signeasy.ui.theme.White
import com.example.signeasy.ui.theme.satoshi_regular

@Composable
fun AppBottomBar(navController: NavHostController, tabs: Array<SignEasyTabs>) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: SignEasyTabs.HOME.route
    val routes = remember { SignEasyTabs.values().map { it.route } }
    if (currentRoute in routes) {
        NavigationBar(
            modifier = Modifier.windowInsetsBottomHeight(
                WindowInsets.navigationBars.add(WindowInsets(bottom = 60.dp))
            ),
            containerColor = White,
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
                                painter = painterResource(id = if (currentRoute == tab.route) tab.icon_filled else tab.icon_outlined),
                                contentDescription = "null",
                                modifier = Modifier
                                    .size(30.dp)
                            )
                            Text(
                                text = stringResource(id = tab.title),
                                fontFamily = satoshi_regular,
                                fontSize = 12.sp
                            )
                        }
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = System_Bright_Blue,
                        unselectedIconColor = Smoky_Gray,
                        selectedTextColor = System_Bright_Blue,
                        unselectedTextColor = Smoky_Gray,
                        indicatorColor = White,
                    )
                )
            }
        }
    }
}