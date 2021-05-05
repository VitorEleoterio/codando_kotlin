abstract class Mamifero (var nome: String) {
    abstract fun falar()
    fun dormir() {
        println("Estou dormindo")
    }
}

class Cachorro (nome: String) : Mamifero(nome) {

    override fun falar() {
        println("au au ")
    }

    

}

class Gato (nome: String) : Mamifero(nome) {
    override fun falar() {
        println("miau")
    }
}

    fun main() {

        Cachorro("Bolt").dormir()
    }
