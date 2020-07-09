fun sayHello(name: String) {
    println("Hello $name")
}

// Single line Ver
// fun sayHello(name: String) = println("Hello $name")

fun sayHi(greet: String, name: String) = println("$greet $name")

fun main() {
    sayHello("Rifqi")
    sayHello( "Universe")
    sayHi("Welcome", "Rifqi")
}