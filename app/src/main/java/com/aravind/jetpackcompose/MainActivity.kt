package com.aravind.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.aravind.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            fonts = listOf(
                Font(R.font.roboto_light, FontWeight.Light),
                Font(R.font.roboto_regular, FontWeight.Normal),
            ))
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green)
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontSize = 50.sp,
                                textDecoration = TextDecoration.Underline,
                                fontStyle = FontStyle.Italic
                            )
                        ) {
                            append("J")
                        }
                        append("etpack")

                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontSize = 50.sp,
                                textDecoration = TextDecoration.Underline,
                                fontStyle = FontStyle.Italic
                            )
                        ) {
                            append("C")
                        }
                        append("ompose")
                    },
                    color = Color.Blue,
                    fontFamily = fontFamily,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

            }
        }
    }
}