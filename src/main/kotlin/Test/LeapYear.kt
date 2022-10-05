import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    print("Enter any  year:")
    var year: Int = reader.nextInt()
    val leapYear=if (year % 4 == 0 && year % 100!=0){
            println("$year is a leap year")
        year
        }else{
            println("$year is a year")
        year
        }
    println("Year=$leapYear")

}