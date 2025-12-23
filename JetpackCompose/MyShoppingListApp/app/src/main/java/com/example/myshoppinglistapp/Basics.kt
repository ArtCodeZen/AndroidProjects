

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map{ it+2 }           // soma + 2 a cada item
    println(doubled)
    // data class
    val blueRose = Vase("tulip", "blue")
    val redRose =  blueRose.copy(color = "red")          // permite usar trocar o valor usando o val

    println(blueRose)
    println(redRose)

    // nullable string
    val name : String? = "Ella"
    name?.let{
        println(it.uppercase())
    }


}

data class Vase(val name: String, val color: String)