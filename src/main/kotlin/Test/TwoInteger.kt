import java.util.*

fun main(args: Array<String>) {
    val reader= Scanner(System.`in`)
    print("Enter the first integer:")
    var integer1:Int=reader.nextInt()
    print("Enter the second integer:")
    var integer2:Int=reader.nextInt()
    val sum=integer1+integer2
    println("Addition of $integer1 and $integer2 is =$sum")


}