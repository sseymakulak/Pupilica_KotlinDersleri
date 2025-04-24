package com.example.kotlindersleri_1.nesne_tabanli_peogramlama

fun main(){
    val f= Fonksiyonlar()

    //void= Unıt
    f.selamla1()

    //return
    val gelenSonuc=f.selamla2()
    println("Gelen Mesaj: $gelenSonuc")


    //parametre
    f.selamla3("Burak")


    f.topla(10,20)

}