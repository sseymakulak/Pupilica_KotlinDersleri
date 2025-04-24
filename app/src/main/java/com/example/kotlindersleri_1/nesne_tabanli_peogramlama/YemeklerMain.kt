package com.example.kotlindersleri_1.nesne_tabanli_peogramlama

fun main(){
    //Nesne oluşturma
    val y1=Yemekler(id = 100, ad = "Kofte", fiyat = 249)
    println("-------------------")
    //Değer okuma

    //println("Id: ${y1.id}")
   //println("Ad: ${y1.ad}")
    //println("Fiyat: ${y1.fiyat}")
    //println("-------------")

    //Değer atamak-değiştirmek
    y1.fiyat=350
    y1.bilgiAl()

    //println("Id: ${y1.id}")
    //println("Ad: ${y1.ad}")
    //println("Fiyat: ${y1.fiyat}")

    println("-------------------")

    val y2=Yemekler(id=200, ad = "Baklava", fiyat = 300)
    y2.bilgiAl()
    //println("Id: ${y2.id}")
    //println("Ad: ${y2.ad}")
    //println("Fiyat: ${y2.fiyat}")
}