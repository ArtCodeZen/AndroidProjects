package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CaptainGame(modifier = Modifier.padding(innerPadding).fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun CaptainGame(modifier: Modifier){
    val treasuresFound = remember {mutableStateOf(0)}
    val direction = remember { mutableStateOf("North") }
    val stormIndicator = remember { mutableStateOf("Normal") }
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Treasures found: ${treasuresFound.value}" )
        Text(text = "Current Direction: ${direction.value}")
        Text(text = "${stormIndicator.value}")
        Spacer(modifier = Modifier.height(15.0.dp))
        // East
        Button(onClick = {
            direction.value = "East"
            if(Random.nextBoolean()){
                treasuresFound.value++
                stormIndicator.value = "Found a treasure"
            }else{
                stormIndicator.value = "Storm"
            }
        }) {
            Text(text = "Sail East")
        }
        // West
        Button(onClick = {
            direction.value = "West"
            if(Random.nextBoolean()){
                treasuresFound.value++
                stormIndicator.value = "Found a treasure"
            }else{
                stormIndicator.value = "Storm"
            }
        }) {
            Text(text = "Sail West")
        }
        // North
        Button(onClick = {
            direction.value = "North"
            if(Random.nextBoolean()){
                treasuresFound.value++
                stormIndicator.value = "Found a treasure"
            }else{
                stormIndicator.value = "Storm"
            }
        }) {
            Text(text = "Sail North")
        }
        // South
        Button(onClick = {
            direction.value = "South"
            if(Random.nextBoolean()){
                treasuresFound.value++
                stormIndicator.value = "Found a treasure"
            }else{
                stormIndicator.value = "Storm"
            }
        }) {
            Text(text = "Sail South")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CaptainGamePreview(){
    CaptainGame(modifier = Modifier.fillMaxSize())
}