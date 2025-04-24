package com.example.kotlindersleri_1.nesne_tabanli_peogramlama

data class Yemekler(var id:Int,var ad:String, var fiyat:Int) {
    //Constructur- init fonksiyonu
    //bu sınıftan nesne oluştuğunda çalışsın
    init {
        println("***Nesne olustu*****")
    }
    fun bilgiAl(){
        println("-------------")
        println("Id: ${id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat}")

    }
    //this : Bulunduğu sınfı temsil eder. Swift dilinde self
    //super:Kalıtım ile bir üst sınıfı temsil eder

}