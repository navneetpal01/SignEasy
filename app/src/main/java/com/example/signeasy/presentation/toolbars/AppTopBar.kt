package com.example.signeasy.presentation.toolbars

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.signeasy.ui.theme.Dove_Gray
import com.example.signeasy.ui.theme.System_White
import com.example.signeasy.ui.theme.Very_Lite_Gray
import com.example.signeasy.ui.theme.satoshi_regular



@Composable
fun AppTopBar() {

    var text by rememberSaveable { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TextField(
            value = text,
            onValueChange = { value ->
                text = value
            },
            label = {
                Text(
                    text = "Search agreements",
                    fontFamily = satoshi_regular,
                    color = Dove_Gray,

                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = System_White,
                unfocusedContainerColor = System_White,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedLabelColor = Dove_Gray,
                unfocusedLabelColor = Dove_Gray
            ),
            leadingIcon = {
                
            },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 5.dp)
                .shadow(elevation = 3.dp, shape = RoundedCornerShape(50.dp))
                .background(color = Very_Lite_Gray, shape = RoundedCornerShape(50.dp))
        )
    }
}