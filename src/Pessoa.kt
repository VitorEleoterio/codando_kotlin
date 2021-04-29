class Pessoa (var nome: String, val anoNasciomento: Int) {
    var diaNascimento: Int? = null
    var mesNascimento: String? = null
    constructor(nome: String,
                anoNasciomento: Int,
                diaNascimento: Int,
                mesNascimento: String
    ) : this(nome, anoNasciomento){
        this.diaNascimento = diaNascimento
        this.mesNascimento = mesNascimento
    }

    fun saudacao() {
        var ola = println("Olá, meu nome é nome $nome e minha data de nascimento é $diaNascimento de $mesNascimento de $anoNasciomento")
    }
}

fun main() {
    val pessoa = Pessoa("Vitor", 1990, 21, "Maio")
    println(pessoa.nome)
    println(pessoa.diaNascimento)
    println(pessoa.mesNascimento)
    println(pessoa.anoNasciomento)
    pessoa.saudacao()
}