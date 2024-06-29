package com.example.signeasy.presentation.bottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBottomSheet(state: SheetState,onDismiss : () -> Unit) {

    ModalBottomSheet(
        sheetState = state,
        onDismissRequest = onDismiss
    ) {
        Column(
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
        ){

        }
    }

}