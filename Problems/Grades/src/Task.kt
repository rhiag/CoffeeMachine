import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var countOfD = 0
    var countOfC = 0
    var countOfB = 0
    var countOfA = 0
    repeat(n) {
            val grade = scanner.nextInt()

            when (grade) {
                2 -> countOfD++
                3 -> countOfC++
                4 -> countOfB++
                5 -> countOfA++
                }
            }
    println("$countOfD $countOfC $countOfB $countOfA")
}
