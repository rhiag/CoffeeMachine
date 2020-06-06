import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val str1 = scanner.next()
    val op = scanner.next()
    val str2 = scanner.next()

    when (op) {
        "equals" -> println(str1 == str2)
        "plus" -> println(str1 + str2)
        "endsWith" -> println(str1.endsWith(str2))
         else -> println("Unknown operation")
    }
}
