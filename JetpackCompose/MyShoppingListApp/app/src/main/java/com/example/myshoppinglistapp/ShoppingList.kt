package com.example.myshoppinglistapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

data class ShoppingItem(
    var id: Int,
    var name: String,
    var quatity: Int,
    var isEditing: Boolean = false

)

@Composable
fun ShoppingListApp(modifier : Modifier){
    var sItems by remember{mutableStateOf(listOf<ShoppingItem>())}
    var showDialog by remember{mutableStateOf(false)}
    Column(
        modifier = modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center

    ){
        Button(
            onClick = {showDialog = true

                      },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ){
            Text(text = "Add Item")
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(16.dp),
        ) {
            items(sItems){

            }
        } // lazy
    }
    if(showDialog){
        AlertDialog(
            onDismissRequest = { showDialog = false },
            confirmButton = {
                TextButton(onClick = { showDialog = false }) {
                    Text("Add")
                }
            },
            dismissButton = {
                TextButton(onClick = { showDialog = false }) {
                    Text("Cancel")

                }
            },
            title = { Text("Add Shopping Item") },
            text = {
                Column {
                    Text("Enter item name here...")
                    // Aqui futuramente entrará seu OutlinedTextField
                }
            })


    }
}

