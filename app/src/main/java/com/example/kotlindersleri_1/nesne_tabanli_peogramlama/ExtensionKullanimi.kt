package com.example.kotlindersleri_1.nesne_tabanli_peogramlama

fun main(){
   val sonuc=5.carp(2)
    println(sonuc)

    //val sonuc=5 carp 2   veya //5.carp(2)
    //println(sonuc)
}

fun Int.carp(sayi:Int) : Int{
    return this * sayi //this(Int) değerini temsil eder

}