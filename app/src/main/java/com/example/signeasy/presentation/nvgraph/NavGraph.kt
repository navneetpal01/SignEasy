package com.example.signeasy.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController


@Composable
fun NavGraph(
    modifier : Modifier = Modifier,
    navController : NavHostController = rememberNavController(),
    startDestination : String = Route.HomeScreen.route
){

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ){

        navigation(
            route = Route.HomeScreen.route,
            startDestination = SignEasyTabs.HOME.route
        ){
            signEasy()
        }

    }



}

class MainActions(navController : NavHostController){
    val moveToInbox : (NavBackStackEntry) -> Unit = {from ->
        if (from.lifecycleIsResumed()){

        }
    }
}

private fun NavBackStackEntry.lifecycleIsResumed() =
    this.lifecycle.currentState == Lifecycle.State.RESUMED