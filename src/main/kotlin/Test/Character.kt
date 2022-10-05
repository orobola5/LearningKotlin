import java.util.*


fun main(args: Array<String>) {
    val reader= Scanner(System.`in`)
    print("Enter :")
    val character : String= reader.next()
    if (character >= "a" && character <= "z"|| character >= "A" && character <= "Z")
        println("$character is an alphabet.")
    else
        println("$character is not an alphabet.")

}