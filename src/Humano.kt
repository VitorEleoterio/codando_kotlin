abstract class Humano {
   lateinit var nome: String

    fun geradorDeNome() {
        nome = "Vitor"
    }

    abstract fun autentica(valor1 : Int, valor2: Int, Soma: Int)
}