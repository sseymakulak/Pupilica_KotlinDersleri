package com.example.kotlindersleri_1.nesne_tabanli_peogramlama

class Fonksiyonlar {
    //void- sadece işlem yapan
    fun selamla1() {//swift->func
        val sonuc = "Merhaba Burak"
        println(sonuc)
    }

    //return- hem işlem hem veri transferi yapan
    fun selamla2(): String {//swift->func
        val sonuc = "Merhaba Burak"
        return sonuc
    }

    //parametre
    fun selamla3(isim: String) {//swift->func
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading
    //bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak
    fun topla(sayi1: Int, sayi2: Int) {
        println("Toplama: $(sayi1+sayi2)")
    }

    fun topla(sayi1: Double, sayi2: Double) {
        println("Toplama: $(sayi1+sayi2)")

    }

    fun topla(sayi1: Double, sayi2: Double,isim: String) {
        println("Toplama: ${(sayi1+sayi2)} - İşlem Yapan: ${isim}")

    }

}