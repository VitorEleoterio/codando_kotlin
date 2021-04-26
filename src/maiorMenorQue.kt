fun main() {

   fun maiorMenorQue(index: Int,valor: Int) {
       var numero = index
       while (numero < valor) {
           println("O valor $numero é MENOR que $valor!")
           numero++

           if (numero >= valor){
               println("O valor $numero é MAIOR ou IGUAL a $valor!")
           }
       }
   }
maiorMenorQue(10, 50)




}