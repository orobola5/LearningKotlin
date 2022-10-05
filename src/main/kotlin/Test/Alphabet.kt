import java.util.*

fun main(){
    val reader= Scanner(System.`in`)
    print("Enter :")
    var ch= readln()
    when(ch.uppercase()){
        "A","E","I","O","U"-> println("$ch is a vowel")
        else->println("$ch is a consonant")
    }
}