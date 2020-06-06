
enum class DangerLevel(val status: String) {
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low");

    fun getLevel(): Int {

        when (status.toUpperCase()) {
            "HIGH" -> return 3
            "MEDIUM" -> return 2
            "LOW" -> return 1
        }
        return 0
    }
}

fun main() {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel())
}
