package com.OscarCode10.myapplication


/*fun main(){
    for (i in 1 .. 10){
        var control:Int=i%2
        if (control==0) {
            println("El $i es número par")
        }
        else{
            println("El $i es número impar")
        }
    }
}*/

/*fun main(){
    var numPar:Int=0
    var numImpar:Int=0
    for (i in 1 .. 10){
        println("digite un número")
        var deci:Int=readLine()!!.toInt()
        var control:Int=deci%2
        if (control==0) {
            numPar+=1
        }
        else{
            numImpar+=1
        }
    }
    println("Los números pares son $numPar y los números impares son $numImpar ")
}*/

fun main(){
    var numPar:Int=0
    var numImpar:Int=0
    var numParMas:Int=0
    var numImparMas:Int=0
    for (i in 1 .. 10){
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
    }
    println("Los números pares son $numPar y los números impares son $numImpar ")
}