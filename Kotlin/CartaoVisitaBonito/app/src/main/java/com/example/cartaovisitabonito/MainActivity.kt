package com.example.cartaovisitabonito

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaovisitabonito.ui.theme.CartaoVisitaBonitoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoVisitaBonitoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Card()
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
            text = stringResource(id = R.string.usuario_nome),
            color = Color.White,
            fontSize = 20.sp
        )
        Text(
            text = stringResource(id = R.string.usuario_information_about),
            color = Color.White,
            fontSize = 30.sp
        )
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .padding(start = 20.dp, bottom = 10.dp)
    ) {
        Text(
            text = stringResource(id = R.string.usuario_email),
            color = Color.White,
            fontSize = 20.sp
        )
        Text(
            text = stringResource(id = R.string.usuario_tel),
            color = Color.White,
            fontSize = 20.sp
        )
        Text(
            text = stringResource(id = R.string.usuario_social),
            color = Color.White,
            fontSize = 20.sp
        )
    }


}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    Text(text = stringResource(R.string.usuario_nome),
        Modifier.padding(top = 20.dp)
        )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CartaoVisitaBonitoTheme {
        Card()
    }
}