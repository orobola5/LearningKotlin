import java.util.*

fun main(){
    var num:Int
    var sum =0
    while (true){
        print("Enter a number")
        num= readLine()!!.toInt()
        if (num==0)
            break
        sum+=num
    }
    print("sum=$sum")
}