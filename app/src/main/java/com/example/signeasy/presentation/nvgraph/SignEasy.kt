package com.example.signeasy.presentation.nvgraph

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.signeasy.R
import com.example.signeasy.presentation.home.HomeScreen
import com.example.signeasy.presentation.inbox.InboxScreen


fun NavGraphBuilder.signEasy() {


    composable(
        route = SignEasyTabs.HOME.route
    ) {
        HomeScreen()
    }
    composable(
        route = SignEasyTabs.INBOX.route
    ) {
        InboxScreen()
    }


}

enum class SignEasyTabs(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val route: String
) {

    HOME(title = R.string.home, icon = R.drawable.home, route = SignEasyDestinations.HOME_ROUTE),
    INBOX(title = R.string.inbox, icon = R.drawable.inbox, route = SignEasyDestinations.Inbox_ROUTE)

}


private object SignEasyDestinations {
    const val HOME_ROUTE = "signEasy/home"
    const val Inbox_ROUTE = "signEasy/inbox"
}