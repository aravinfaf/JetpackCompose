package com.aravind.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aravind.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//
//      <--- -   Column basic details ---->
//            Column(
//                Modifier
//                    .fillMaxSize(0.5f)
//                    .background(Color.Blue),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {
//                Text(text = "Aravind")
//                Text(text = "Kumar")
//
//            }

            Row (
                Modifier
                    .fillMaxSize()
                    .background(Color.Blue),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                    ){
                Text(text = "Aravind")
                Text(text = "Kumar")
                Text(text = "Raj")
            }
           }
    }
}