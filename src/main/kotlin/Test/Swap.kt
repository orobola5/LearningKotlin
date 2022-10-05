fun main(args: Array<String>) {

    var first = 145
    var second = 5

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")
    val temporary = first
    first = second
    second = temporary

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}