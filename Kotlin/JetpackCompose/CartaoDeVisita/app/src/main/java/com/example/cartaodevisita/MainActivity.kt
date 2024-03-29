package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
@Composable
fun MyImage(){
    val image = painterResource(R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier.height(100.dp)
    )
}
@Composable
fun Card(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        MyImage()
        Text(
            text = stringResource(id= R.string.usuario_nome),
            color = Color.White,
            fontSize = 40.sp
        )
        Text(
            text = stringResource(id= R.string.usuario_information_about),
            color = Color.White,
            fontSize = 40.sp
        )
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CartaoDeVisitaTheme {
        Card()
    }
}