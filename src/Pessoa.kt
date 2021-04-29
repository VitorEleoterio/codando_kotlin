class Pessoa (var nome: String, val anoNasciomento: Int) {
    fun saudacao() {
        var ola = println("Olá, meu nome é nome $nome e meu ano de nascimento é $anoNasciomento")
    }
}

fun main() {
    val pessoa = Pessoa("Vitor", 1990)

    println(pessoa.nome)
    println(pessoa.anoNasciomento)
    println(pessoa.saudacao())
}