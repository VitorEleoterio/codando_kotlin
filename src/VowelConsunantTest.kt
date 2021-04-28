import org.junit.Assert
import org.junit.Test

class VowelConsunantTest {

    @Test fun countVowels(){
        Assert.assertEquals(11, countVowels("Quantas vogais tem esta frase?"))
    }

    @Test fun countConsonants(){
        Assert.assertEquals(0, countConsonants("Geralmente uma frase possui mais consoantes"))
    }

    @Test fun countVowelsAndConsonants(){
        val phrase = "Kotlin é muito maneiro"
        Assert.assertEquals(10, countVowels(phrase))
        Assert.assertEquals(9, countConsonants(phrase))
    }
    
}