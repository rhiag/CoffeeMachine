import java.util.*

// write your code here
fun divide(num1: Long,num2:Long) :Double {

       return  (num1.toDouble() / num2.toDouble())

 }
/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    println(divide(a, b))
}