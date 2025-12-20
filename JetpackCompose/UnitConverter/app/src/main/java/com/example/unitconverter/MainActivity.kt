package com.example.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme
import kotlin.math.roundToInt

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
    var inputValue by remember { mutableStateOf("") }
    var outputValue by remember { mutableStateOf("") }
    var inputUnit by remember { mutableStateOf("Centimeters") }
    var outputUnit by remember { mutableStateOf("Meters") }
    var iExpanded by remember { mutableStateOf(false) }
    var oExpanded by remember { mutableStateOf(false) }
    val oConversionFactor = remember { mutableStateOf(1.00) }
    val conversionFactor = remember { mutableStateOf(1.00) }
    fun convertUnit(){
        // elvis operator ?:
        val inputValueDouble = inputValue.toDoubleOrNull()?:0.0
        // 1. Faz a conversão pura
        val rawResult = inputValueDouble * conversionFactor.value / oConversionFactor.value

        // 2. Arredonda para 2 casas decimais
        val result = (rawResult * 100).roundToInt() / 100.0

        outputValue = result.toString()

    }
    Column(modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Unit Converter", modifier= Modifier.border(BorderStroke(2.dp, Color.Black)).padding(2.dp))
        Spacer(modifier = Modifier.height(30.dp))       // espaçamento

        OutlinedTextField(colors = OutlinedTextFieldDefaults.colors(focusedTextColor = Color.Black,

            unfocusedTextColor = Color.Red),value = inputValue, onValueChange = {
                inputValue = it
                convertUnit()
            },
            label = {Text("Enter value")})

        Spacer(modifier = Modifier.height(30.dp))       // espaçamento
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)){
            Box{
                Button(onClick = {
                    iExpanded = true

                }){
                    Text(inputUnit)
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")

                }

                DropdownMenu(expanded = iExpanded, onDismissRequest = {  iExpanded = false}, offset = DpOffset(0.dp, 20.dp) ) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Centimeters"
                            conversionFactor.value = 0.01
                            convertUnit()

                        })
                    DropdownMenuItem(
                        text = {Text("Meters")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Meters"
                            conversionFactor.value = 1.00
                            convertUnit()

                        })
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Feet"
                            conversionFactor.value = 0.3048
                            convertUnit()
                        })
                    DropdownMenuItem(
                        text = {Text("Milimeters")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Milimeters"
                            // milimeters
                            conversionFactor.value = 0.001
                            convertUnit()
                        })
                }
            }

            Box{
                Button(onClick = {
                    oExpanded = true

                }){
                    Text(outputUnit)
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")

                }

                DropdownMenu(expanded = oExpanded, onDismissRequest = {  oExpanded = false}, offset = DpOffset(0.dp, 20.dp) ) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = {
                            oExpanded = false
                            outputUnit = "Centimeters"
                            oConversionFactor.value = 0.01
                            convertUnit()
                        })
                    DropdownMenuItem(
                        text = {Text("Meters")},
                        onClick = {
                            oExpanded = false
                            outputUnit = "Meters"
                            oConversionFactor.value = 1.00
                            convertUnit()

                        })
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = {
                            oExpanded = false
                            outputUnit = "Feet"
                            oConversionFactor.value = 0.3048
                            convertUnit()
                        })
                    DropdownMenuItem(
                        text = {Text("Milimeters")},
                        onClick = {
                            oExpanded = false
                            outputUnit = "Milimeters"
                            oConversionFactor.value = 0.001
                            convertUnit()
                        })
                }
            }
        } // row
        Spacer(modifier = Modifier.height(30.dp))       // espaçamento
        Text("Result: $outputValue", style = MaterialTheme.typography.headlineMedium )


    } // column
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverterTheme {
        UnitConverter(Modifier.fillMaxSize())
    }
}