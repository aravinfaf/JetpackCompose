package com.aravind.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aravind.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(12.dp)
                    .width(200.dp)
                    //.requiredHeight(300.dp) // It will outside if value gets exceed
                    .border(5.dp, Color.Blue) // Overlap on text. so add padding for text
                    .padding(5.dp)
                    .border(10.dp, Color.DarkGray)
                    .padding(10.dp)
                    .border(5.dp, Color.Green)
                    .padding(5.dp)
                  //  .offset(20.dp, 20.dp) // Works like margin but not. Overlaps on next(kumar) text. So add spacer between
            ) {
                Text(text = "Aravind",
                modifier = Modifier
                    .background(Color.Yellow)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "kumar",Modifier.clickable {  })
            }
        }
    }
}