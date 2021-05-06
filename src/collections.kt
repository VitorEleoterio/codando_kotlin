fun main() {
    val estados1 = listOf<String>("São Paulo", "Rio de Janeiro", "Santa Catarina")
    val estados2 = mutableListOf("São Paulo", "Rio de Janeiro", "Santa Catarina")

    val estado3 = arrayListOf("São Paulo", "Rio de Janeiro", "Santa Catarina")

    val estado4 = setOf("São Paulo", "Rio de Janeiro", "Santa Catarina", "São Paulo", "Rio de Janeiro", "Santa Catarina")
    val estado5 = mutableSetOf("São Paulo", "Rio de Janeiro", "Santa Catarina")

    val estado6 = hashMapOf<String, String>(Pair("key", "value"), Pair("Brasil", "Brasilia"), Pair("França", "Paris"))

    val estado7 = mapOf(Pair("key", "value"), Pair("Brasil", "Brasilia"), Pair("França", "Paris"))
    val estado8 = mutableMapOf(Pair("key", "value"), Pair("Brasil", "Brasilia"), Pair("França", "Paris"))

    println(estado6["Paris"])

}