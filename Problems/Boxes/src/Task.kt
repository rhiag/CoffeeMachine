import java.lang.Math.sqrt
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val X1 = scanner.nextInt()
    val Y1 = scanner.nextInt()
    val Z1 = scanner.nextInt()
    val X2 = scanner.nextInt()
    val Y2 = scanner.nextInt()
    val Z2 = scanner.nextInt()
//    val A1 = X1*Y1*Z1
//    val A2 = X2*Y2*Z2


    if (X1 == X2 && Y1== Y2 && Z1 == Z2) println("Box 1 = Box 2")
    else if(X1 < X2 && Y1 < Y2 && Z1 < Z2) println("Box 1 < Box 2")
    else if (X1 > X2 && Y1 > Y2 && Z1 > Z2) println("Box 1 > Box 2")
    else println("Incomparable")

}