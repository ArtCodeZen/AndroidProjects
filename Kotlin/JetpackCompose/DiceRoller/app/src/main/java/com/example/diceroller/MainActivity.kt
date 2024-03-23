package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DiceRollerApp()
                }
            }
        }
    }
}
@Preview
@Composable
fun DiceRollerApp(){
    DiceRollerTheme{
        DiceWithButtonAndImage()

    }
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier
    .fillMaxSize()
    .fillMaxHeight()
    .background(color = Color.White)
){
    var result by remember {mutableStateOf(1)}
    var changing by remember { mutableStateOf(false) }
    val imageResource = when(result){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    LaunchedEffect(changing) {
        if(changing)
        {
            var increaseSpeedMs: Long = 200
            val nTimes = 20
            repeat(nTimes){
                while(true){
                    var cacheResult = (1..6).random()
                    if(result != cacheResult){
                        result = cacheResult
                        increaseSpeedMs -= increaseSpeedMs / nTimes
                        break
                    }

                }
                delay(increaseSpeedMs)

            }
            changing = false // reset
        }
    }
    // expressão lambda

    val rodar = {
        //result = (1..6).random()
        changing = true
    }
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(

                painter = painterResource(id = imageResource),
                contentDescription = "1",
                modifier = Modifier
                    .clickable {rodar()}
        )

        Button(

            onClick = {
                rodar()},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)

        ) {
            Text(text = stringResource(id = R.string.roll))


        }
        Text(text = result.toString(),
            color = Color.Black)
    }
}
