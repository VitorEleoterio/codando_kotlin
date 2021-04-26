import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

   try {
       println("teste".toInt())
   } catch (e: NumberFormatException) {
       println("Esse valor não é um numero!")
   } catch (e: Exception) {
       println("Algo de errado ocorreu")
   } finally {
       println("teste 2")
       println("teste 3")
   }


}