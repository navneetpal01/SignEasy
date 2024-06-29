package com.example.signeasy.presentation.nvgraph


sealed class Route(
    val route: String
) {
    object HomeScreen : Route(route = "HomeScreen")

}