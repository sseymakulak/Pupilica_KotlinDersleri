package com.example.kotlindersleri_1.standart_programlama

fun main(){

    for(i in 1..3){ //swift de 1...3
        println("Dongu 1:$i")
    }

    //10 20 arasında 5er 5 er artma
    for(x in 10..20 step 5 ){
        println("Dongu 2:$x")

    }


    //20 10 arasında 5er 5 er azalma
    for(x in 20 downTo 10 step 5 ){
        println("Dongu 3:$x")
    }

     //1,2,3
    var sayac=1

    while(sayac<4){
        println("Dongu 4: $sayac")
        sayac+=1 //sayac=sayac+1
    }

    //1,2,3,4,5
    for(i in 1..5){
        if (i==3){
            continue //Bulunduğu adımı pas geçer
        }
        println("Dongu5 : $i")
    }
}