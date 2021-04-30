enum class Prioridade(val id: Int) {
    BAIXA(1){
        override fun toString(): String {
            return "Super baixa, não se preocupe"
        }
            },

    MEDIA(5), ALTA(10)

}

class Alarme(var desc: String, p: Prioridade)

fun main() {

    Alarme("Aviso!", Prioridade.ALTA)

    for (p in Prioridade.values()) {
        println("$p - ${p.id} - ${p.ordinal}")
    }

}