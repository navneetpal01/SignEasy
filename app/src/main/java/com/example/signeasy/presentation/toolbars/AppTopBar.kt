package com.example.signeasy.presentation.toolbars

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
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


@SuppressLint("UnrememberedMutableInteractionSource")
@Composable
fun AppTopBar() {

    val topPadding = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()
    val bottomPadding = topPadding / 2

    Row(
        modifier = Modifier
            .padding(top = topPadding, bottom = bottomPadding)
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
                tint = Dark_Slate_Gray,
                modifier = Modifier
                    .clickable(interactionSource = MutableInteractionSource(), indication = null) {

                    }
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .background(color = Very_Lite_Gray, shape = RoundedCornerShape(30.dp)),
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
                text = "Search agreements",
                fontSize = 15.sp,
                fontFamily = satoshi_regular,
                color = Dove_Gray
            )
        }

        IconButton(
            onClick = {
                //TODO
            },
            colors = IconButtonDefaults.iconButtonColors(containerColor = Very_Lite_Gray),
            modifier = Modifier
                .size(30.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Sidebar",
                tint = Dark_Slate_Gray,
                modifier = Modifier
                    .size(17.dp)
                    .clickable(interactionSource = MutableInteractionSource(), indication = null) {


                    }
            )
        }
    }
}