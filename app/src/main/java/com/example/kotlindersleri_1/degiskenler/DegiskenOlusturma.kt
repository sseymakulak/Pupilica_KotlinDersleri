package com.example.kotlindersleri_1.degiskenler

fun main(){
    var id=1
    var ad="Mont"
    var resim="mont.png"
    var puan=4.7
    var fiyat=4500
    var stokDurum=true

    println(id)
    println(ad)
    println(resim)
    println(puan)
    println(fiyat)
    println(stokDurum)

    //print ile diğer yazım
    println("Id: $id")
    println("ad: $ad")
    println("resim: $resim")
    println("puan: $puan")
    println("fiyat: $fiyat")
    println("stokDurum: $stokDurum")

    //Sabitler- Constant
    var sayi=30
    sayi=100
    println(sayi)

    val numara=50 //val sabit demek sabitlenmiş oluyor
    println(numara)

    //tür dönüşümü
    //1-sayısaldan sayısala dönüşüm
    val d=89.56
    val i=34
    val sonuc1=d.toInt()
    println(sonuc1)  //çıktı: 89
    val sonuc2=i.toDouble()
    println(sonuc2)  //çıktı: 34.0

    //2-Sayısaldan metine dönüşüm
    var x=85
    val sonuc3=x.toString() //"85"
    println(sonuc3)

    //3-metinden sayısala dönüşüm
    val yazi="48"
    val sonuc4=yazi.toIntOrNull()
    println(sonuc4)

    if(sonuc4 !=null){
        println(sonuc4)
    }else{
        println("Sonuç nulldur.")
    }

    val yazi1="48T"
    val sonuc5=yazi.toIntOrNull()
    println(sonuc5)  //null çıktı

    if(sonuc4 !=null){
        println(sonuc4)
    }else{
        println("Sonuç nulldur.")
    }

}

