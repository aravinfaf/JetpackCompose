package com.aravind.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aravind.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LazyColumn{
                itemsIndexed( listOf("Hello","Aravind","Kumar","Raj",
                    "Hello","Aravind","Kumar","Raj",
                    "Hello","Aravind","Kumar","Raj")){
                    index: Int, item: String ->
                    Text(
                        text = "$item",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth().padding(20.dp)
                    )

                }
            }
//            <------------------------------------------------------------------------------------>
            // Default scroll
            // Generate items only while scrolling
//            LazyColumn{
//                items(count = 500) {
//                    Text(
//                        text = "Item $it",
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.fillMaxWidth().padding(20.dp)
//                    )
//                }
//            }
//   <---------------------------------------------------------------------------------------------->
            // We need to give custom scroll state
//            val scrollState = rememberScrollState()
//            Column (
//                modifier = Modifier.fillMaxSize().verticalScroll(scrollState)
//                    ){
//                for (i in 0..50){
//                    Text(
//                        text = "Item $i",
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.fillMaxWidth().padding(20.dp)
//                    )
//                }
//            }

        }
    }
}