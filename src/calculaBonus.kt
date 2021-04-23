fun main() {

    fun calculaBonus(cargo: String, salario: Float): Float {
        var bonus: Float = salario
        if (cargo == "Coordenador") {
            bonus = salario * 0.2f
        } else if (cargo == "Gerente Junior") {
            bonus = salario * 0.5f
        } else {
            bonus = salario * 2
        }

        return bonus

    }

    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Junior", 1000f))
    println(calculaBonus("Diretor", 1000f))

    val valor = 10
    val resultado = if (valor == 10) "Sim" else "não"
}