package com.OscarCode10.myapplication

import android.text.BoringLayout
import java.sql.Struct

class Nequi {
}

fun login():Boolean {
    var op:String="si"
    var veces:Int=0
    var estado:Boolean
    do{
        veces+=1
        println("Aclaración, tienes maxímo tres intentos")
        println("Ingresa el número de telefono")
        var numTell:Long= readLine()!!.toLong()
        println("Ingresa el pin de 4 dígitos")
        var pin:Int= readLine()!!.toInt()
        if (numTell==3223496849 && pin==2005){
            println("Si usuario y contraseña son correctos permitir el acceso")
            estado=true
            break
        }else{
            println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos más")
            estado=false
        }
        if (veces>=3){
            println("Contraseña bloqueada")
            estado=false
            break
        }
        println("Quieres volver a intentarlo? si/no")
        op= readLine().toString()
    }while (op=="si")
    return estado
}
fun saca(saldo:Int?):Int{
    if (saldo!!<2000) {
        println("No te alcanza para retirar")
        return 1
    }else{
        println("Puedes elegir entre:\n" +
                "1 cajero\n" +
                "2 punto físico")
        var deci:Int= readLine()!!.toInt()
        return (100000..999999).random()
    }
}
fun envia(saldo: Int?):Int{
    println("Digite el número de telefono")
    var numTell:Int= readLine()!!.toInt()
    println("Digite el dinero que le enviará")
    var dinero:Int= readLine()!!.toInt()
    if (dinero>saldo!!) {
        println("No es posible enviar el dinero")
        return 1
    }else {
        return saldo-dinero
    }
}

fun recargar(saldo: Int?):Int{
    println("Cuanto desea recargar?")
    var recar:Int= readLine()!!.toInt()
    println("Seguro que quiere recargar $recar? si/no")
    var deci:String= readLine().toString()
    if (deci=="si"){
        return saldo!!+recar
    }else{
        println("uf, estuvo cerca")
        return 1
    }
}
fun recargaCelular(saldo: Int?):Int{
    println("Ingresa el número")
    var numTell:Int= readLine()!!.toInt()
    println("Ingresa el operador")
    var op:Int= readLine()!!.toInt()
    println("Ingresa el valor que recargará")
    var recarga:Int= readLine()!!.toInt()
    if (recarga>saldo!!){
        println("El dinero que quieres recargar es más del que tienes, no te alcanza")
        return 1
    }else{
        return saldo-recarga
    }
}
fun pagarFactura(saldo: Int?):Int{
    println("Ingresa el número de la factura")
    var fac:Int= readLine()!!.toInt()
    println("Ingresa el valor de la factura")
    var valor:Int= readLine()!!.toInt()
    if (valor>saldo!!){
        println("El dinero que quieres pagar es más del que tienes, no te alcanza")
        return 1
    }else{
        return saldo-valor
    }
}
fun main(){
    var login=login()
    if (login==true){
        var saldo:Int=4500
        var op:String="si"
        do {
            println("Tu saldo actualmente es $saldo, puedes\n" +
                    "1 Sacar dinero\n" +
                    "2 Envía dinero\n" +
                    "3 Recarga dinero\n" +
                    "4 Recarga de celular\n" +
                    "5 \n" +
                    "4 Salir del app")
            var deci:Int= readLine()!!.toInt()
            when (deci){
                1->{
                    var result=saca(saldo)
                    if (result==1){
                        print("Debes recargar")
                    }else{
                        println(result)
                    }
                }
                2->{
                    var envia=envia(saldo)
                    if (envia==1){
                        println("Debes enviar un valor menor o igual al que tienes")
                    }else{
                        println("Dinero enviado tu slado es $envia")
                        saldo=envia
                    }
                }
                3->{
                    var recargar= recargar(saldo)
                    if (recargar==1){
                        println("Tu saldo es $saldo")
                    }else{
                        saldo=recargar
                    }
                }
                4->{
                    var recargarCelular= recargaCelular(saldo)
                    if (recargarCelular==1){
                        println("Debes tener más dinero")
                    }else{
                        saldo=recargarCelular
                    }
                }
                5->{
                    var pagarfactura= pagarFactura(saldo)
                    if (pagarfactura==1){
                        println("Debes tener más dinero")
                    }else{
                        pagarfactura=saldo
                    }
                }
                6 ->{
                    println("Gracias por usar nequi")
                    break
                }
            }
            println("Quieres seguir utilizando el nequi? si/no")
            op= readLine().toString()
        }while (op=="si")
    }
}