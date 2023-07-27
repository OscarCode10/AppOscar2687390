package com.OscarCode10.myapplication

class Funciones {
}
//Funcion por expresión
/*fun main(){
    val temperature=20
    val isHot=if(temperature>40)true else false

    print(isHot)
}*/

/*fun main(){
    println("Digite su edad")
    val age:Int=readLine()!!.toInt()
    val discotk=if(age>=18)true else false

    if (discotk==true) {
        println("Purede entrar pro")
    }else{
        println("No puede entrar manquito")
    }
}*/

//Funciones personalizadas
/*fun printHello(){
    println("Hello World")
}
fun main(){
    printHello()
}*/
//Función sin valor de retorno ni parámetros
fun calulatePe(){
    println("Digita el radio del circulo")
    var radio:Int= readLine()!!.toInt()
    var result=(3.1416*2)*radio
    println("El perímetro es: $result")
}
fun calulateAr(){
    println("Digita el radio del circulo")
    var radio:Int= readLine()!!.toInt()
    var result=3.1416*(radio*radio)
    println("El area es: $result")
}
//Función sin valor de retorno y con parámetros
fun calculateArTri(base:Int?, altura:Int?): Unit{
    var result=base!!*altura!!
    println("El area del Triángulo es: $result")
}
fun calculatePeTri(lado1:Int?, lado2:Int?, lado3:Int?): Unit{
    if(lado1==lado2 && lado1==lado3 ){
        println("El triángulo es equilátero y")
    }else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
        println("El triángulo es escaleno y")
    }else{
        println("El triángulo es isóceles y")
    }
    var result=lado1!!+lado2!!+ lado3!!

    println("El Perímetro del Triángulo es: $result")
}
//Función con valor de retorno y con parámetros
fun calculatePeRe(base:Int?, altura:Int?):Int{
    return (base!!*2)+(altura!!*2)
}
fun calculateArRe(base:Int?, altura:Int?):Int{
    return base!!*altura!!
}
fun calculatePeCu(lado:Int?):Int{
    return 4*lado!!
}
fun calculateArCu(lado:Int?):Int{
    return lado!!*lado!!
}
fun main(){
    var op:String="si"
    do {
        println("Digita que quieres hacer: \n" +
                "1 calcular Perímetro de un circulo, 2 calcular el area de un circulo, \n" +
                "3 calcular Perímetro de un Triángulo, 4 calcular el area de un Triángulo, \n" +
                "5 calcular Perímetro de un Rectángulo, 6 calcular el area de un Rectángulo \n" +
                "7 calcular Perímetro de un Triángulo, 8 calcular el area de un Cuadrado" )
        var deci:Int= readLine()!!.toInt()
        when(deci){
            1->{
                calulatePe()
            }
            2->{
                calulateAr()
            }
            3->{
                println("Digita el lado 1")
                var lado1:Int= readLine()!!.toInt()
                println("Digita el lado 2")
                var lado2:Int= readLine()!!.toInt()
                println("Digita el lado 3")
                var lado3:Int= readLine()!!.toInt()
                calculatePeTri(lado1,lado2,lado3)
            }
            4->{
                println("Digita la base del Triángulo")
                var base:Int= readLine()!!.toInt()
                println("Digita la altura del Triángulo")
                var altura:Int= readLine()!!.toInt()
                calculateArTri(base, altura)
            }
            5->{
                println("Digita la base del rectángulo")
                var base:Int= readLine()!!.toInt()
                println("Digita la altura del rectángulo")
                var altura:Int= readLine()!!.toInt()
                println("El Perímetro del Rectángulo es: "+calculatePeRe(base, altura))
            }
            6->{
                println("Digita la base del rectángulo")
                var base:Int= readLine()!!.toInt()
                println("Digita la altura del rectángulo")
                var altura:Int= readLine()!!.toInt()
                println("El Area del Rectángulo es: "+calculateArRe(base, altura))
            }
            7->{
                println("Digita el lado del cuadrado")
                var lado:Int= readLine()!!.toInt()
                println("El Perímetro del Cuadrado es: "+calculatePeCu(lado))
            }
            8->{
                println("Digita el lado del cuadrado")
                var lado:Int= readLine()!!.toInt()
                println("El Perímetro del Cuadrado es: "+calculateArCu(lado))
            }
        }
        println("Quiere seguir usando el programa? si/no")
        op=readLine().toString()
    }while (op=="si")
}
