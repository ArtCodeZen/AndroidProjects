package com.example.aprendendokotlin

fun option(i : Int) : String{

    when(i){
        1-> return "Option $i"
        2 -> return "Option $i"
        3 -> return "Option $i"
        4 -> return "Option $i"
        in 5..10 -> return "Option $i"
        else -> return "Invalid Option"
    }
}

fun main(){
    println(option(10))
    print(option(20))
}