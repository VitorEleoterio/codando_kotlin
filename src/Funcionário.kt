abstract class Funcionario {
   abstract fun calculaBonus(valor1: Float, valor2: Float): String
   fun imprimeBonus(){
       println("Bonus: ${calculaBonus(250f,250f)}")
   }

}


class Gerente : Funcionario() {
    override fun calculaBonus(valor1: Float, valor2: Float) :String {
        var soma = valor1+valor2
        return "Valor do bonus é: $soma"
    }
}

class Diretor : Funcionario(){
    override fun calculaBonus(valor1: Float, valor2: Float) :String {
       var soma = valor1+valor2*0.4
        return "Valor do bonus é: $soma"
    }
}

fun main() {
    val gerente: Funcionario = Gerente()
    val diretor: Funcionario = Diretor()

    calculo(gerente)
    calculo(diretor)

}

fun calculo(funcionario: Funcionario){
    funcionario.imprimeBonus()
}