package com.example.signeasy.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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

        composable<Route.HomeScreen> {

        }




    }








}