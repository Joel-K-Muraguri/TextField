package com.example.textfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfield.ui.theme.TextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        var text by remember {
            mutableStateOf(" ")
        }
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text(text = "Name")
            },
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Person , contentDescription = "Person Icon")
                }
            },
            )
    Spacer(modifier = Modifier.height(20.dp))

        var name by remember {
            mutableStateOf("")
        }
        Text(text = "Hello $name",
        modifier = Modifier
            .padding(10.dp))
        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
        label = { Text(text = "Name")})

        }
    }


@Composable
fun DisplayOutlinedTextField(){


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextFieldTheme {
        Greeting()
    }
}