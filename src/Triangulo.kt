data class Triangulo(val area: Float) {
}

class Quadrado(val area: Float) {
}

fun main() {
    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    println(q1)
    println(t1)


}