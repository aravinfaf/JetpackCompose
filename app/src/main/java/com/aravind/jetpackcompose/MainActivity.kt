package com.aravind.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Provides default material styles(Toolbar,drawer)
            val scaffoledState = rememberScaffoldState()
            var textFiledState by remember{
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()

            Scaffold(scaffoldState = scaffoledState) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp)
                    ) {
                    TextField(
                        value = textFiledState,
                        label = {
                            Text(text = "Enter Name")
                        },
                        onValueChange = {
                            textFiledState = it
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    Button(onClick = {
                        //Not good directly calling coroutine
                        scope.launch {
                            scaffoledState.snackbarHostState.showSnackbar("Hello $textFiledState")

                        }
                    }) {
                        Text(text = "Click Me")
                    }
                }
            }
        }
    }
}