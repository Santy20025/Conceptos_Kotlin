En Kotlin, definimos parámetros opcionales proporcionando un valor predeterminado 
para ellos en la definición de la función. De esta manera, cuando llamamos 
a la función sin especificar ese argumento, se utiliza el valor predeterminado.
 
 Ejemplo:

fun greet(name: String = "World") {
    println("Hello, $name!")
}