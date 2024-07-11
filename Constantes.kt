Se definen utilizando la palabra "val". Es un valor que no se puede ecambiar
una vez ya tenga aignado un valor. Esto genera inmutabilidad. lo cual es util 
para cuando no se requiera asegurar un valor y no se cambie durante la ejecucion
del programa.

ejemplo:

fun main() {
    val count: Int = 2
    println(count)
}