class Constants {
    companion object BANCO {
        val TABLE = "Pessoa"

        fun teste(){
            println("Sou um método estático")
        }
    }



    object VENDAS {
        val TABLE_NAME = "Vendas"

        object COLUNAS {
            val ID = "Id"
            val TOTAL = "Total"
        }
    }
}

fun main() {

    println(Constants.TABLE)
    Constants.teste()

    Constants.BANCO.TABLE
    Constants.BANCO.teste()

    Constants.VENDAS.COLUNAS.TOTAL

}