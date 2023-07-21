package com.OscarCode10.myapplication

import android.text.BoringLayout
import java.security.KeyStore.TrustedCertificateEntry

fun main() {
    /*val pets= arrayOf("Perro","Gato", "Samuel")
    println(pets.contentToString())
    println(pets[1])
    pets[2]="Pajaro"
    println(pets.contentToString())

    for (i in pets){
        println(i)
    }

    for ((index,i) in pets.withIndex()){
        println(" $index $i ")
    }*/

    //Listas inmutables, que no se pueden cambiar
    /*val instruments = listOf("trompetra", "piano", "guitarra")
    val instrumentos: List<String> = listOf("trumpet","piano","violin")
    println(instrumentos)
    println(instruments)

    println(instruments[1])*/
    //Listas mutables
    var myList=mutableListOf("trompeta","piano","violin")
    println(myList)
    myList[2]="guitarra"
    println(myList)
    //Mostrar primer y último elemento de una lista
    println(myList.first())
    println(myList.last())
    //Agregar un elemento a una lista
    myList.add("bateria")
    println(myList)
    //Agregar varios elementos a una lista
    myList.addAll(listOf("maracas","tambor"))
    println(myList)
    //Eliminar un elemento específico de la lista
    myList.removeAt(0)
    println(myList)
    //Eliminar un elemento que coincida con la cadena
    myList.remove("tambor")
    println(myList)
    //Elimina toda la lista o arreglo
    myList.removeAll(myList)
    println(myList)
    //Buscar un elemento y ver su posición
    myList.add("tambor")
    var saber:Boolean=myList.contains("tambor")
    if (saber==true){
        println(myList.indexOf("tambor"))
    }else{
        println("manco")
    }

}