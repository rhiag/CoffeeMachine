import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val ch = scanner.next().first()

    if(ch.isUpperCase() ||(ch.isDigit() && ch in '1'..'9')){
        println("true")
    }else println("false")

}