import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter any  number:")
    val num  : Int = reader.nextInt()
    for (i in 1..12) {
        val product = num * i
        println("$num * $i = $product")
    }
}