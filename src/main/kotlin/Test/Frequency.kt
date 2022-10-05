fun main(args: Array<String>) {
    val str = " Find the frequency of a character in a string"
    val ch = 'r'
    var frequency = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]) {
            ++frequency
        }
    }

    println("Frequency of $ch = $frequency")
}