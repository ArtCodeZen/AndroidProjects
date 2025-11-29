package com.example.basicsclass

fun main(){
    val coffeeForDenis = CoffeeDetails(1, "Cappuccino", "Grande", 2)
    makeCoffee(coffeeForDenis)
}

fun makeCoffee(coffee: CoffeeDetails){
    println("Making a ${coffee.size} ${coffee.name} with ${coffee.sugarCount} spoons of sugar and ${coffee.creamAmount} spoons")
}