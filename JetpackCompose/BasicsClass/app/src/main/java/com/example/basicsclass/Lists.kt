package com.example.basicsclass

val shoppingList = listOf("processor", "ram", "gpu", "cpu")
// mutable list
val mutableShoppingList = mutableListOf("processor", "ram", "gpu", "cpu")

fun main(){
    for(item in shoppingList){
        println(item)
    }
    mutableShoppingList.add("motherboard")
    mutableShoppingList.remove("gpu")
    mutableShoppingList.removeAt(0)
    mutableShoppingList.add(0, "SSDs")
    mutableShoppingList[0] = "NVME"

    mutableShoppingList.set(0, "WaterCooling")
    println(mutableShoppingList)
    println(mutableShoppingList.contains("ram"))
    println("Usando o for: ")
    for(item in 0 until 2){
        println(mutableShoppingList[item])
    }


}
