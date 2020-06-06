fun main() {
    val input = readLine()!!
    if (input.isNotEmpty()) {
        val a: String = input.drop(1)
        val b = a.toInt()
        when (input.first()) {
         'i' -> {
                 println("${b+1}")
                 println(b)
                }
          's' -> println(a.reversed())
         }
        if (input.first() !in 0..9) {
            println(input)
        }
    }
}
