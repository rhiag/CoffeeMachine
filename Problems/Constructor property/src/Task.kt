fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
    //timer.time = 500
    //println(timer.time)
}

class ByteTimer( time: Int) {
        var time = time
            get() {
                if (field < -128) return -128
                else if (field > 127) return 127
                else return field
            }
             set(value) {
                field = value
                 //println("inside $field")
             }

}