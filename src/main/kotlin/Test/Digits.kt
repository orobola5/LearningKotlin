fun main(args: Array<String>) {
    var count = 0
    var num = 123456789

    while (num != 0) {
        num /= 10
        ++count
    }

    println("Number of digits: $count")
}