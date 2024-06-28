package com.example.signeasy

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.signeasy.presentation.bottomsheet.AppBottomSheet
import com.example.signeasy.presentation.nvgraph.NavGraph
import com.example.signeasy.presentation.nvgraph.Route
import com.example.signeasy.presentation.nvgraph.SignEasyTabs
import com.example.signeasy.presentation.toolbars.AppBottomBar
import com.example.signeasy.presentation.toolbars.AppTopBar
import com.example.signeasy.ui.theme.SignEasyTheme
import com.example.signeasy.ui.theme.System_Bright_Blue
import com.example.signeasy.ui.theme.System_White
import com.example.signeasy.ui.theme.White
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignEasyApp() {
    SignEasyTheme {
        val tabs = remember {
            SignEasyTabs.values()
        }
        val navController = rememberNavController()
        val scaffoldState = rememberBottomSheetScaffoldState(
            bottomSheetState = SheetState(skipPartiallyExpanded = true)
        )
        val scope = rememberCoroutineScope()

        AppBottomSheet(state = scaffoldState) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                    containerColor = System_White,
                    topBar = {
                        AppTopBar()
                    },
                    bottomBar = {
                        AppBottomBar(navController = navController, tabs = tabs)
                    }
                ) { paddingValues ->
                    NavGraph(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValues),
                        navController = navController,
                        startDestination = Route.HomeScreen.route
                    )
                }
                FloatingActionButton(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(30.dp)
                        .align(Alignment.BottomCenter),
                    onClick = {
                        scope.launch {
                            scaffoldState.bottomSheetState.show()
                        }
                    },
                    containerColor = System_Bright_Blue,
                    contentColor = White,
                    elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 5.dp),
                    shape = CircleShape
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.add),
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp)
                    )
                }

            }
        }
    }
}




