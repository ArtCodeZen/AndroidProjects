package com.example.helloworldcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworldcomposable.ui.theme.HelloWorldComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("artcodezen")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Surface(color = Color.Red){
        Text(text = "Hello my name is: $name!", modifier = Modifier.padding(50.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWorldComposableTheme {
        Greeting("artcodezen")
    }
}