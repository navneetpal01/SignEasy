package com.example.signeasy.presentation.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.signeasy.ui.theme.System_White


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBottomSheet(
    state: BottomSheetScaffoldState,
    modifier: Modifier,
    context: @Composable () -> Unit
) {
    BottomSheetScaffold(
        modifier = modifier,
        scaffoldState = state,
        sheetContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.45f)
                    .background(System_White)
            ) {

            }
        },
    ) {
        context.invoke()
    }
}