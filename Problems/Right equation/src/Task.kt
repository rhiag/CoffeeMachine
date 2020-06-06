import java.util.*

// write your code here
fun isRightEquation(num1: Int,num2: Int,num3: Int): Boolean =  num1 * num2 == num3


/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(isRightEquation(a, b, c))
}