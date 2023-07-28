package com.OscarCode10.myapplication

fun main(){
    println("Bienvenidos a supermercados Noè tenemos una oferta, si tu valor de compra es mayor a 50.000 tendrás la oportunidad de conseguir un descuento:\n "+
    "Si sacas la bolita roja obtienes 10% en el valor de tu compra\n " +
    "Si sacas la bolita azul obtienes un 30% en el valor de tu compra\n " +
    "Si sacas la bolita amarilla obtienes un 50% en el valor de tu compra\n " +
    "Si sacas la bolita blanca te llevas tu compra gratis")
    println("Digite el valor de su compra")
    var compra= readLine()!!.toInt()
    if (compra>=50000){
        val bolita=(1..4).random()
        if(bolita==1) {
            var desc=compra*0.10
            println("Tu compra es mayor a 50000! y tienes un descuento del 10%! , el precio total es ${desc}")
        }
        else if(bolita==2) {
            var desc=compra*0.3
            println("Tu compra es mayor a 50000! y tienes un descuento del 30%! , el precio total es ${desc}")
        }
        else if(bolita==3) {
            var desc=compra*0.5
            println("Tu compra es mayor a 50000! y tienes un descuento del 50%! , el precio total es ${desc}")
        }
        else{
            println("Tu compra es mayor a 50000! y tu compra es totalmente gratis Felicidades!!")
        }
    }
    else {
        println("El total de tu compra es ${compra}")
    }
}