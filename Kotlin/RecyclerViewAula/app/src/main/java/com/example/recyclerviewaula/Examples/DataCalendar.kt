package com.example.recyclerviewaula.Examples

import java.time.LocalDate
import java.util.Date


fun main(){
    val date = LocalDate.of(2025, 5 , 15)
    val today = if(date.year == 2024) true else false
    println(today)

    println(Date().time)

}