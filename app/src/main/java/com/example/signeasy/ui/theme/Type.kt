package com.example.signeasy.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.signeasy.R


val satoshi_black = FontFamily(Font(R.font.satoshi_black))
val satoshi_black_italic = FontFamily(Font(R.font.satoshi_black_italic))
val satoshi_bold = FontFamily(Font(R.font.satoshi_bold))
val satoshi_bold_italic = FontFamily(Font(R.font.satoshi_bold_italic))
val satoshi_italic = FontFamily(Font(R.font.satoshi_italic))
val satoshi_light = FontFamily(Font(R.font.satoshi_light))
val satoshi_light_italic = FontFamily(Font(R.font.satoshi_light_italic))
val satoshi_medium = FontFamily(Font(R.font.satoshi_medium))
val satoshi_medium_italic = FontFamily(Font(R.font.satoshi_medium_italic))
val satoshi_regular = FontFamily(Font(R.font.satoshi_regular))




// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)