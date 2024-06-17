package com.example.signeasy.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController


@Composable
fun NavGraph(
    navController : NavHostController = rememberNavController(),
    startDestination : Route = Route.HomeScreen
){

    NavHost(
        navController = navController,
        startDestination = startDestination
    ){

        navigation<Route.HomeScreen>(
            startDestination = Route.HomeScreen
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