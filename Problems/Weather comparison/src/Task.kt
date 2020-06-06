class City(val name: String) {
    var degrees: Int = 0
    get()  {
        when (field < -92 || field > 57) {
            name == "Moscow" -> field = 5
            name == "Hanoi" -> field = 20
            name =="Dubai" -> field = 30
        }
        return field
    }
    set(value) {
          field = value
      }
}


fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    if(first > second && first > third) println ("Dubai")
    else if(second > first && second > third) println ("Moscow")
    else if(third > first && third > second) println ("Hanoi")
    else if ( first == second || first == third || second == third) println("neither")
}