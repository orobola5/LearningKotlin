import java.util.*

fun main(){
    val reader= Scanner(System.`in`)
    print("Enter a number:")
    var number:Int=reader.nextInt()
    if (number%2==0){
        println("$number is an even number")
    }
    else{
        println("$number is an odd number")
    }
}