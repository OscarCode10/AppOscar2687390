package com.OscarCode10.myapplication

fun main() {
    var cars= mutableListOf<String>()
    var op:String="si"
    do{
        println("Este es un sistema para trabajar con carros: añadir 1, mostrar 2, buscar 3, modificar 4, eliminar 5 y borrar la lista de carros 6")
        var deci:Int=readLine()!!.toInt()
        when(deci) {
            1 -> {
                println("Ingrese el carro que quiere registrar")
                var car:String=readLine().toString()
                if (cars.contains(car)==true){
                    println("Lo siento el carro ya existe")
                }
                cars.add(car)
                println("Se registro el carro")
            }
            2->{
                println("La lista de carros es: ")
                if (cars==emptyList<String>()){
                    println("no hay carros")
                }
                for ((index,i) in cars.withIndex()){
                    println("El carro $index es $i")
                }
            }
            3->{
                println("Ingresa el carro que quieres buscar")
                var car:String=readLine().toString()
                if (cars.contains(car)==true){
                    var posi:Int=cars.indexOf(car)
                    println("El carro fue encontrado, es $posi "+cars[posi])
                }
                println("El carro no existe")
            }
            4->{
                println("Ingresa la posición que quieres modificar")
                var posi:Int=readLine()!!.toInt()
                if(posi<cars.size) {
                    var car:String=cars[posi]
                    println("El carro es $car, ingresa por cuál quieres cambiarlo")
                    var newCar:String=readLine().toString()
                    car=newCar
                    println("Se modifico")
                }
                println("La posición no existe")
            }
            5->{
                println("Ingresa la posición que quieres eliminar")
                var posi:Int=readLine()!!.toInt()
                if(posi<cars.size) {
                    var car:String=cars[posi]
                    println("El carro $car se eliminó")
                    cars.removeAt(posi)
                }
                println("La posición no existe")
            }
            6->{
                println("Seguro que quieres eliminarla? si o no")
                var deci:String=readLine().toString()
                if (deci=="si"){
                    cars.removeAll(cars)
                    println("Eliminada")
                }
                println("Que susto, no se eliminó nada")
            }
        }
        println("Quiere seguir usando el programa")
        op=readLine().toString()
    }while (op=="si")
}