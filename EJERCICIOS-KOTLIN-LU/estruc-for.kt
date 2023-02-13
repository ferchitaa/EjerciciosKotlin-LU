// 7. realizar  un algoritmo que lea un número y determine si éste es divisible entre 11.
fun main() {
    print("ingrese la cantidad de numeros a procesar: ")
    val cantidad=readLine()!!.toInt()
    for (I in 1.. cantidad){
        print("ingresar un numero: ")
        val numero=readLine()!!.toInt()
        if(numero % 11==0){
            println("el numero $numero es divisible entre 11")
        }
        else{
        println("el numero $numero no es divisible de 11")
        }
    }
}
