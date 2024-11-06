package com.example.aulaactivityfragment

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import java.io.Serializable
//// usando o formato java do serializable
//data class Filme (
//    val nome: String,
//    val descricao: String,
//    val avaliacoes: Double,
//    val diretor: String,
//    val distribuidora: String
//
//) : Serializable

@Parcelize
data class Filme(
    var nome: String,
    var descricao: String,
    var avaliacoes: Double,
    var diretor: String,
    var distribuidora: String
) : Parcelable