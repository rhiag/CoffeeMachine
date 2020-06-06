import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val ch1 = scanner.next().first()
    val ch2 = scanner.next().first()
    val ch3 = scanner.next().first()
    val ch4 = scanner.next().first()
    var c1 = ch1.isDigit()
    var c2 = ch2.isDigit()
    var c3 = ch3.isDigit()
    var c4 = ch4.isDigit()

    println("$c1\\$c2\\$c3\\$c4")

}