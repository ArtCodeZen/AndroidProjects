package com.example.basicsclass

fun main(){
    // Creating an object/instance of the Dog class

    var myDog = Dog("half", "Husky")
    // para alterar diretamente precisamos deixar em modo var no construtor
    // e não em val
    myDog.name = "New"
    myDog.age = 5
    myDog.bark()
}