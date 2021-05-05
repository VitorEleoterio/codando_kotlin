interface Eletronico {
    fun ligar()
    fun desligar() {
        println("Off")
    }
}

class Notebook : Eletronico {
    override fun ligar() {

    }

    override fun desligar() {

    }

}