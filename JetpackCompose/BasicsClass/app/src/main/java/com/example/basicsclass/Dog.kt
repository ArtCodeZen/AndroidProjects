package com.example.basicsclass

class Dog (var name: String, val breed: String, var age: Int = 0){

    init{
        bark()
    }
    fun bark(){
        println("The dog $name, the breed $breed and the age $age is barking")
    }
}

