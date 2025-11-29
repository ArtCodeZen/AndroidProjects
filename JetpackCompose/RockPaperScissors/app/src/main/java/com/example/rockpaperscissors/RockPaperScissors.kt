package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoise = ""
    while(true) {
        println("Rock, Paper or Scissors?")
        playerChoise = readln()
        if (playerChoise == "exit") {
            break
        }
        val randomNumber = (1..3).random()
        when (randomNumber) {
            1 -> computerChoice = "Rock"
            2 -> computerChoice = "Paper"
            3 -> computerChoice = "Scissors"
        }
        val winner = when {
            playerChoise == computerChoice -> "Draw"
            playerChoise == "Rock" && computerChoice == "Scissors" -> "Player"
            playerChoise == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoise == "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }
        println("Player chose: $playerChoise")
        println("Computer chose: $computerChoice")
        println("The winner is: $winner\n")
    }
}