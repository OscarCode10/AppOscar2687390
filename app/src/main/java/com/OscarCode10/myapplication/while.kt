package com.OscarCode10.myapplication

fun main(){

    var numPar:Int=0
    var numImpar:Int=0
    var numParMas:Int=0
    var numImparMas:Int=0
    var op:String="si"
    while(op=="si") {
        println("digite un número")
        var deci:Int=readLine()!!.toInt()
        var control:Int=deci%2
        if (deci<=0) {
            println("Lo siento, ingresaste 0 o un número menor")
            break
        }
        else if (control==0) {
            numParMas+=deci
            numPar+=1
        }
        else{
            numImparMas+=deci
            numImpar+=1
        }
        println("Deseas digitar otro número")
        op= readLine().toString()
    }
    println("La suma de los numeros pares es $numParMas y la suma de los numeros impares es $numImparMas")
    println("Los números pares son $numPar y los números impares son $numImpar ")
}