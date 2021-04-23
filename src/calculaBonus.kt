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

    val teste: Int? = null
    val operacao: Int = teste ?: 100

    val teste2: Int? = 10
    val operacao2: Int = teste2 ?: 100


    // a variavel imutavel teste é do tipo inteiro e pode receber numeros inteiros ou vazio (null/nulo)
    // caso a variavel não mutavel "operacao" receber um valor inteiro, a mesma irá receber a vareavel teste, caso ela seja vazia (null/nulo), ela ira receber 100 inteiro

    println(operacao)
    println(operacao2)
}