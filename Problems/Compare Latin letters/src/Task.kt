import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val l1 = scanner.next().first()
    val l2 = scanner.next().first()

    val ch1 = l1.toLowerCase()
    val ch2 = l2.toLowerCase()

    if (ch1 == ch2) {
        println("true")
    } else {
        println("false")
    }
}
