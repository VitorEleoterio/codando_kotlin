fun main() {
    fun media(vararg notas: Float){
        if (notas.isNotEmpty()){
            var soma = 0f
            for (nota in notas) {
                soma += nota
            }
            println("A média é: ${soma/notas.size}")
        }

    }

    media(10f, 20f,30f, 50f)
}