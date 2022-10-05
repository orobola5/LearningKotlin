fun main(args: Array<String>) {
    val base = 3
    var exponent = 4
    var result= 1

    while (exponent != 0) {
        result *= base
        --exponent
    }

    println("Answer = $result")
}