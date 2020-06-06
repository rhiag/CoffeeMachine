import java.util.*

// write your function here
fun isGreater(a: Int, b: Int, c: Int, d: Int): Boolean {
    return a + b > c + d
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val num4 = scanner.nextInt()
    
    println(isGreater(num1, num2, num3, num4))
}
