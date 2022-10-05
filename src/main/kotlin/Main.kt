fun main(args: Array<String>) {
////    println("Hello World!")
////    // Try adding program arguments via Run/Debug configuration.
////    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
////    println("Program arguments: ${args.joinToString()}")
//    val a = 1
//    val b = true
//    var c = 1
//    val a = 10
//    val b = 9
//    val c = -1
//    val result:Boolean
//    result=(a>b) or (a>c)
//    println(result)
//    var result: Int
//    var booleanResult: Boolean
//    result = -a
//    println("-a = $result")
//    booleanResult = !b
//    println("!b = $booleanResult")
//    --c
//    println("--c = $c")
//    val t=-12
//    val d=12
//    val max=if (t>d){
//        println("t is larger than d.")
//        t
//    }else{
//        println("d is larger than t.")
//        d
//    }
//    println("max=$max")
    val numbers= intArrayOf(1,4,42,-3)
    val num=2
    if ( num in numbers){
        println("numbers array contains dis number $num.")
    }else{
        println("numbers array does not contain dis number $num")
    }
val a= intArrayOf(1,2,3,4,-1)
    println(a[1])
    a[1]=12
    println(a[1])

    val number1=55
    val convertedNumber=number1.toFloat()
    println(convertedNumber)
}