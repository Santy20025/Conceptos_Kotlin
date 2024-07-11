En kotlis se puede tabajar con valores nulos de manera segura utilizando el sistema de tipos que 
kotlin proporciona. Se trata en forma separada las variables que permiten almacenar un valor null
y aquellas que por su naturaleza no lo pueden almacenar.

Ejemplo: 

fun main() {
    val favoriteActor = null
    println(favoriteActor)
}