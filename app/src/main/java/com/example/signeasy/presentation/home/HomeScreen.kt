package com.example.signeasy.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signeasy.R
import com.example.signeasy.ui.theme.Dark_Slate_Gray
import com.example.signeasy.ui.theme.System_Black
import com.example.signeasy.ui.theme.System_Bright_Blue
import com.example.signeasy.ui.theme.White
import com.example.signeasy.ui.theme.satoshi_bold
import com.example.signeasy.ui.theme.satoshi_light
import com.example.signeasy.ui.theme.satoshi_medium

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            UsageCard(
                onUpgradeClick = {
                    //TODO -:
                }
            )
        }
        item {
            DetailsTab()
        }
    }
}

@Composable
private fun UsageCard(
    onUpgradeClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f),
        colors = CardDefaults.cardColors(containerColor = White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = "Account Usage",
                fontFamily = satoshi_bold,
                fontSize = 20.sp,
                color = System_Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(
                painter = painterResource(id = R.drawable.exit),
                contentDescription = "Account Usage",
                tint = Dark_Slate_Gray,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 15.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "3 free sends remaining",
                    fontFamily = satoshi_medium,
                    style = TextStyle(
                        platformStyle = PlatformTextStyle(
                            includeFontPadding = false
                        )
                    ),
                    fontSize = 18.sp,
                    color = System_Black,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = "Signing is always free",
                    fontFamily = satoshi_light,
                    style = TextStyle(
                        platformStyle = PlatformTextStyle(
                            includeFontPadding = false
                        )
                    ),
                    fontSize = 15.sp,
                    color = System_Black,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .padding(vertical = 15.dp),
                onClick = onUpgradeClick,
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = System_Bright_Blue)
            ) {
                Text(
                    text = "Upgrade",
                    fontFamily = satoshi_medium,
                    color = White,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 3.dp)
                )
            }
        }
    }
    Spacer(modifier = Modifier.height(20.dp))
}

@Composable
private fun DetailsTab() {
    Row(
        modifier = Modifier
            .fillMaxWidth(0.9f),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Card(
            modifier = Modifier
                .weight(0.45f)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            shape = RoundedCornerShape(10.dp)
        ) {

        }
        Spacer(modifier = Modifier.width(10.dp))
        Card(
            modifier = Modifier
                .weight(0.45f)
                .height(150.dp),
            colors = CardDefaults.cardColors(containerColor = White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            shape = RoundedCornerShape(10.dp)
        ) {

        }
    }
}















