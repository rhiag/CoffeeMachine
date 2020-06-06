import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val ans = scanner.nextInt()
    when (ans) {
        1 -> println("No!")
        2 -> println("Yes!")
        3 -> println("No!")
        4 -> println("No!")
        else -> println("Unknown number")
    }
}
