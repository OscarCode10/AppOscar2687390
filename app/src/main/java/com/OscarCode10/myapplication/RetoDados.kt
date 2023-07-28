package com.OscarCode10.myapplication

fun main(){
    println("Vamos a jugar Craps, apuestas todo en un tiro")
    println("Solo ganas si sacas:\n" +
            "Un par de unos\n" +
            "Un total de tres sumando los dados\n" +
            "Un total de once sumando los dados\n" +
            "Si obtienes un total de dos o doce sumando los dados\n" +
            "Un total de siete sumando los dados")
    var dado1:Int= (1..6).random()
    var dado2:Int= (1..6).random()
    println("Quieres lanzar? si/no")
    var deci:String= readLine().toString()
    if (deci=="si"){
        var sum:Int=dado1+dado2
        if (dado1==1 && dado2==1){
            println("Ganaste, sacaste un par de $dado1")
        }else if (sum==3){
            println("Ganaste, por qué sacaste $dado1 y $dado2 que sumados dan $sum")
        }else if (sum==11){
            println("Ganaste, por qué sacaste $dado1 y $dado2 que sumados dan $sum")
        }else if (sum==2 || sum==12){
            println("Ganaste, por qué sacaste $dado1 y $dado2 que sumados dan $sum")
        }else if (sum==7){
            println("Ganaste, por qué sacaste $dado1 y $dado2 que sumados dan $sum")
        }else{
            println("Perdiste, sacaste $dado1, $dado2 y sumados dan $sum")
        }
        println("Termino el game")
    }else{
        println("Esta bien, vuelve pronto")
    }

}