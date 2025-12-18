package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   UnitConverter(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun UnitConverter(modifier: Modifier = Modifier){
    Column(modifier){
        Text("Unit Converter")
        OutlinedTextField(value = "Digite algo", onValueChange = {/* here goes what should happen, when the Value of our OutlinedTextField changes}*/})
        Row{
            val context = LocalContext.current

            Button(onClick = { Toast.
                makeText(context,
                    "Button Clicked",
                    Toast.LENGTH_SHORT).show()}){
                Text("Clique aqui")
            }
            Box(){

            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverterTheme {
        UnitConverter()
    }
}