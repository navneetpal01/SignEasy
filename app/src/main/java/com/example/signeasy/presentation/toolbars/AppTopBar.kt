package com.example.signeasy.presentation.toolbars

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signeasy.R
import com.example.signeasy.ui.theme.Dark_Slate_Gray
import com.example.signeasy.ui.theme.Dove_Gray
import com.example.signeasy.ui.theme.Very_Lite_Gray
import com.example.signeasy.ui.theme.satoshi_regular


@Composable
fun AppTopBar() {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
    ) {

        IconButton(
            onClick = {
                //TODO
            }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.sidebar),
                contentDescription = "Sidebar",
                tint = Dark_Slate_Gray
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(0.7f)
//                .border(width = 1.dp, color = Very_Lite_Gray, shape = RoundedCornerShape(30.dp))
                .background(color = Very_Lite_Gray, shape = RoundedCornerShape(30.dp)),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search",
                tint = Dark_Slate_Gray,
                modifier = Modifier
                    .padding(8.dp)
            )
            Text(
                text = "Search file, template, tool...",
                fontSize = 8.sp,
                fontFamily = satoshi_regular,
                color = Dove_Gray
            )
        }

        IconButton(
            onClick = {
                //TODO
            }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.sidebar),
                contentDescription = "Sidebar",
                tint = Dark_Slate_Gray
            )
        }


    }
}