package XIIIColecoes

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)

fun main() {


    // Cria lista de dados
    val data = listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receita("Lasanha", 500),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )
    val lasanhaNumber = data
    var resultado = 0
    var temLasanha: Boolean

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")
    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()}")
    // Tenho alguma receita de Lasanha?
    if (data.any { it.nome == "Lasanha" }) {
        println("Tenho receita de Lasanha na minha lista de receitas")
    } else {
        println("Não tenho receita de Lasanha na minha lista de receitas")
    }
    // Quantas receitas de Lasanha?
    resultado = lasanhaNumber.count { it.nome == "Lasanha" }

    if (resultado >= 1) {
        println("Tenho $resultado receitas de lasanha na minha lista de receitas")
    } else {
        println("Não tenho receitas de lasanha na minha lista")
    }

    // Qual a primeira e última receita?
    println("A primeira receira é: ${data.first().nome}")
    println("A ultima receira é: ${data.last().nome}")
    // Qual a soma de calorias?
    val sumCalories = data.sumBy { it.calorias }
    println("A soma de calorias é: $sumCalories")

    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }


        // Sei como fazer panqueca? E sushi?
    val panqueca = data.any { it.nome == "Panqueca" }
    val sushi = data.any { it.nome == "Sushi" }
    when {
        panqueca && sushi == true -> println("Eu sei fazer panquecas e Sushi")
        panqueca == false && sushi == true -> println("Eu sei fazer Sushi e não sei fazer panquecas")
        panqueca == true && sushi == false -> println("Eu sei fazer panquecas e não sei fazer sushi")
        else -> println("Eu não sei fazer panquecas e sushi")
    }

    val seiFazerPanqueca = data.any { it.nome == "Panqueca" }
    val seiFazerSushi = data.any { it.nome == "Sushi" }

    when {
        seiFazerPanqueca && seiFazerSushi -> println("Eu sei fazer panquecas e Sushi")
        seiFazerPanqueca.not() && seiFazerSushi -> println("Eu sei fazer Sushi e não sei fazer panquecas")
        seiFazerPanqueca && seiFazerSushi.not() -> println("Eu sei fazer panquecas e não sei fazer sushi")
        else -> println("Eu não sei fazer panquecas e sushi")
    }

    val temPanqueca = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (temPanqueca) "sim" else "não"}")

    val temSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi? ${if (temSushi) "sim" else "não"}")


        // Quais são as comidas com mais de 500 calorias?
    val maior500 = data.filter { it.calorias > 500 }.forEach { println(it.nome) }

        // Par (chave, valor) de comidas com mais de 500 calorias, (nome, calorias)
    data.filter { it.calorias > 500 }
        .map{ Pair(it.nome, it.calorias) }
        .forEach { println("${it.first} : ${it.second} calorias") }

        //Qual das receitas possui farinha como ingrediente?


        // Qual a receita mais calórica? E a menos calórica?


        // Faça uma lista com o nome dos pratos

        // Qual a média de calor de todas as receitas?

        // Lista de dados simples

        // Eliminar receitas com mesmo nome

        // Ordenar uma lista

        // Inverter uma lista

}
