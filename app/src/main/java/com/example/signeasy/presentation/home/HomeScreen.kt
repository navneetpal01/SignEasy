package com.example.signeasy.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.signeasy.ui.theme.White

@Composable
fun HomeScreen(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(225.dp),
                colors = CardDefaults.cardColors(contentColor = White, containerColor = White)
            ){

            }
        }

        item {

        }
    }
}