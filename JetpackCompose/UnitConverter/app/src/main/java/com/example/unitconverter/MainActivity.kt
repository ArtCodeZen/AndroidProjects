package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   UnitConverter(modifier = Modifier.padding(innerPadding).fillMaxSize())
                }
            }
        }
    }
}
@Composable
fun UnitConverter(modifier: Modifier){
    Column(modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Unit Converter", modifier= Modifier.border(BorderStroke(2.dp, Color.Black)).padding(2.dp))
        Spacer(modifier = Modifier.height(30.dp))       // espaçamento
        OutlinedTextField(value = "Digite algo", onValueChange = {/* here goes what should happen, when the Value of our OutlinedTextField changes}*/})
        Spacer(modifier = Modifier.height(30.dp))       // espaçamento
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)){
            val context = LocalContext.current

            Button(onClick = { Toast.
                makeText(context,
                    "Button Clicked",
                    Toast.LENGTH_SHORT).show()}){
                Text("Clique aqui")
            }

            Box(){

                Button(onClick = {}){
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")

                }

                DropdownMenu(expanded = true, onDismissRequest = {}, offset = DpOffset(0.dp, 20.dp) ) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = {})
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = {})
                    DropdownMenuItem(
                        text = {Text("Milimeters")},
                        onClick = {})
                }
            }

            Box(){
                Button(onClick = {}){
                    Text("Select1")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")

                }
                DropdownMenu(expanded = false, onDismissRequest = {}) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = {})
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = {})
                    DropdownMenuItem(
                        text = {Text("Milimeters")},
                        onClick = {})
                }
            }
        } // row


    } // column
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverterTheme {
        UnitConverter(Modifier.fillMaxSize())
    }
}