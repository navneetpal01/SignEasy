package com.example.signeasy.presentation.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBottomSheet(state: BottomSheetScaffoldState, mainContent: @Composable () -> Unit) {
    BottomSheetScaffold(
        scaffoldState = state,
        sheetContent = {
            //TODO
            Column(
                modifier = Modifier
                    .fillMaxSize(0.4f)
            ) {

            }
        },
        modifier = Modifier
            .systemBarsPadding()
            .fillMaxSize()
    ) {
        mainContent.invoke()
    }

}