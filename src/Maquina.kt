open class Maquina(var marca: String?) {

    var nucleos1: Int = 0
    get() {
        println("Get foi chamado")
        return field
    }

    set(value) {
        println("Set foi chamado")
        field = value
    }
}

class Computador(marca: String?, val nucleos: Int?): Maquina(marca) {
    
}

fun main() {

}