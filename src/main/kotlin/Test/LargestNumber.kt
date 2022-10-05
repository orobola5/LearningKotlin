import java.util.*

fun main(){
    val reader= Scanner(System.`in`)
    print("Enter the first number:")
    var n1:Int=reader.nextInt()
    print("Enter the second number:")
    var n2:Int=reader.nextInt()
    print("Enter the second number:")
    var n3:Int=reader.nextInt()

    val max=if (n1>n2){
        if (n1>n3) n1 else n3
    }else{
        if (n2>n3) n2 else n3
    }
    println("max=$max")
}
