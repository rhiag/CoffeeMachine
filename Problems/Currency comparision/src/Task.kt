import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val c1 = input.next()
    val c2 = input.next()

    val country1 = Money.isMoney(c1)
    val country2 = Money.isMoney(c2)
    Money.compare(country1, country2)
}

enum class Money(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kirbati", "Australian dollar"),
    NULL(" ", " ");

    companion object {
        fun isMoney(country: String): Money {
            for (enum in Money.values()) {
                if (country.toUpperCase() == enum.name) return enum
            }
            return NULL
        }

        fun compare(country1: Money, country2: Money) {
            if (country1.currency == country2.currency) {
                println("true")
            } else println("false")
        }
    }
}
