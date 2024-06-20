package com.example.signeasy.presentation.nvgraph

import kotlinx.serialization.Serializable


sealed class Route(
    val route : String
){
    object HomeScreen : Route(route = "HomeScreen")

}