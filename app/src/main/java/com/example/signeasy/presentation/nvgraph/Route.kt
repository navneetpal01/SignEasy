package com.example.signeasy.presentation.nvgraph

import kotlinx.serialization.Serializable


@Serializable
sealed class Route{

    @Serializable
    object HomeScreen : Route()

    @Serializable
    object InboxScreen : Route()
}