import java.util.Scanner
fun main(){
//    print("Enter text: ")
//    val stringInput= readLine()!!
//    println("you entered: $stringInput")
    val reader=Scanner(System.`in`)
    print("Enter the first number:")
    var number1:Int=reader.nextInt()
    print("Enter the second number:")
    var number2:Int=reader.nextInt()
    var sum = number1+number2
    println("the sum of $number1 + $number2:$sum")

var max=if (number1>number2){
    println("$number1 is greater than $number2")
    number1
}else if (number1==number2){
    println("$number1 is equal to $number2")
    number1

} else{
    println("$number1 is lesser than $number2")
    number2
}
    println("the max number is:$max")
}