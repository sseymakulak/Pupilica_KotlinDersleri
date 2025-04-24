package com.example.kotlindersleri_1.standart_programlama

fun main(){
    val yas=22

    if(yas>=18){
        println("Resitsiniz.")
    }else{
        println("Resit değilsiniz.")
    }


    val ka="admin"
    val s=12345
    val sayi=10

    if(ka == "admin" && s==12345)
    {
        println("Hosgeldiniz")
    }else{
        println("hatalı giris")
    }

    if(sayi ==9  || sayi==10)
    {
        println("Sayi 9 veya 10")
    }else{
        println("Sayi 9 veya 10 değil")
    }

    //When, diğer dillerde switch olarak bilinir.
    val number=1
    when(number){
        1-> println("Sayi 1")
        2->println("Sayi 2")
        3->println("Sayi 3")
        else->println("Tanımlanmayan sayi")
    }


}