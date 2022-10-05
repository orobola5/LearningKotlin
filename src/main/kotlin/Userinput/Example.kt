import java.util.*

fun main() {
//    val number = 5
//    val result = if (number > 0) "positive number" else "negative number"
//    println(result)

//    val a=-9
//    val b=-11
//    val max=if (a>b){
//        println("$a is larger than $b.")
//        println("max variable holds value of a.")
//        a
//
//    }else{
//        println("$b is larger than $a.")
//        println("max variable holds value of b.")
//        b
//    }
//    println("max = $max")

//    val reader= Scanner(System.`in`)
//    print("Enter the first number:")
//    var n1:Int=reader.nextInt()
//    print("Enter the second number:")
//    var n2:Int=reader.nextInt()
//    print("Enter the second number:")
//    var n3:Int=reader.nextInt()
//
//    val max=if (n1>n2){
//        if (n1>n3) n1 else n3
//    }else{
//        if (n2>n3) n2 else n3
//    }
//    println("max=$max")
//

//    val reader= Scanner(System.`in`)
//    print("Enter :")
//    var ch= readln()
//    when(ch.uppercase()){
//        "A","E","I","O","U"-> println("$ch is a vowel")
//        "1","2","3","4","5"->println("$ch is a NUMBER")
//        else->println("$ch is a consonant")
//    }

//    val reader = Scanner(System.`in`)
//    print("Enter hour:")
//    var hour: Int = reader.nextInt()
//    when(hour){
//        in 0..12-> println("$hour:am")
//        in 12..24->{var num = hour-12
//            println("$num:pm")
//        }

//    }
//    print("Enter minute:")
//    var minute: Int = reader.nextInt()
//    print("Enter seconds:")
//    var seconds: Int = reader.nextInt()
//    var displayTime = if (hour < 12) {
//        println("$hour:am")
//        hour
//    } else {
//    var num=hour-12
//        println("$num:pm")
//        hour
//    val reader = Scanner(System.`in`)
//    print("Enter any  year:")
//    var year: Int = reader.nextInt()
//    val leapYear=if (year % 4 == 0 && year % 100!=0){
//            println("$year is a leap year")
//        year
//        }else{
//            println("$year is a year")
//        year
//        }
//    println("leapYear=$leapYear")

//    println("displayTime=$displayTime")


//    when (n){
//        in 1..10-> println("A positive integer less than 11")
//
//        in 10..100-> println("A positive  btw 10 and 100(inclusivw)")
//    }
//    var num=100
//    var sum =0
//    while (num<=100){
////        println("loop=$num")
//        sum+=num
//        num++
//
//    }
//    while (num!=0){
//        sum+=num
//        num--
//    }
//    println(sum)

//    var num:Int
//    var sum =0
//    while (true){
//        print("Enter a number")
//        num= readLine()!!.toInt()
//        if (num==0)
//            break
//        sum+=num
//    }
//    print("sum=$sum")

//first@ for (i in 1..4){
//    second@ for (j in 1..2){
//        println("i=$i;j=$j")
//        if (i==3)
//            break@first
//    }
//}
    var number=4
    outer@ while (number>0){
        var num=4
        inner@ while (num>0){
            if (number==2)
                break@outer
            println("number=$number,num=$num")
            num--
        }
        number--
    }

}