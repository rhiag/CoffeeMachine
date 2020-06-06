import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var partsReady = 0
    var partsToFix = 0
    var partsReject = 0

    repeat(n) {
        val parts = scanner.nextInt()
        when (parts) {
            0 -> partsReady++
            1 -> partsToFix++
            -1-> partsReject++
        }
    }
    println("$partsReady $partsToFix $partsReject")
}