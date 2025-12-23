package com.example.myshoppinglistapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
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
    var itemName by remember { mutableStateOf("") }
    var itemQuantity by remember {mutableStateOf("")}
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
                ShoppingListItem(it, {}, {})
            }
        } // lazy
    }
    if(showDialog){
        AlertDialog(
            onDismissRequest = { showDialog = false },
            confirmButton = {
                TextButton(onClick = {
                  if(itemName.isNotBlank() && itemQuantity.isNotBlank()){
                      val newItem = ShoppingItem(
                          id = sItems.size + 1,
                          name = itemName,
                          quatity = itemQuantity.toInt()
                      )
                      sItems = sItems + newItem
                      showDialog = false
                      itemQuantity = ""
                      itemName = ""
                  }
                }) {
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
                    OutlinedTextField(value = itemName,
                        onValueChange = {itemName = it},
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        label = { Text("Item name") })
                    OutlinedTextField(value = itemQuantity,
                        onValueChange = {itemQuantity = it},
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        label = { Text("Item quantity")},
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number)
                    )

                }

            })


    }
}
@Composable
fun ShoppingListItem(
    item: ShoppingItem,
    onEditClick: () -> Unit,                            // expressão lambda Unit não retorna nada
    onDeleteClick: () -> Unit,                          // expressão lambda
    modifier: Modifier = Modifier
){
    Row(
        modifier = Modifier.padding(8.dp).border(border = BorderStroke(2.dp, Color(0xFF018786)),
            shape = RoundedCornerShape(8.dp)),

    ) {
        Text(text = item.name, modifier = Modifier.padding(8.dp))
    }
}

