package machine


fun main(args: Array<String>) {

    val coffeeMachine = CoffeeMachine()
    val ml = MenuLevel.MAIN_MENU
    displayMainMenu()
    loop@ while (true) {
        val input = readLine()!!
        if(input == "exit") break@loop
        else coffeeMachine.processInput(input)
    }
}

class CoffeeMachine() {
   var water = 400
   var milk = 540
   var beans = 120
   var cups = 9
   var cash = 550
   var ml: MenuLevel = MenuLevel.MAIN_MENU

    fun processInput(input: String) {
        if((ml == MenuLevel.MAIN_MENU && input == "fill") || (ml.cat == "fill" )) fill(input)
        else if ((ml == MenuLevel.MAIN_MENU && input == "buy")||(ml == MenuLevel.SUB_BUY)) buy(input)
        else if(ml == MenuLevel.MAIN_MENU && input == "remaining"|| (ml == MenuLevel.SUB_REMAINING)) remaining(input)
        else if(ml == MenuLevel.MAIN_MENU && input == "take"||(ml == MenuLevel.SUB_TAKE)) take(input)
        }

    fun take(input: String){
        if(ml == MenuLevel.MAIN_MENU && input == "take"){
            ml = MenuLevel.SUB_TAKE
            println("I gave you $$cash")
            cash = 0
        }
        ml = MenuLevel.MAIN_MENU
        displayMainMenu()
    }

    fun remaining(input: String){
        if (ml == MenuLevel.MAIN_MENU && input =="remaining") {
            ml = MenuLevel.SUB_REMAINING
            println("The coffee machine has:")
            println("$water of water")
            println("$milk of milk")
            println("$beans of coffee beans")
            println("$cups of disposable cups")
            println("$$cash of money")
            println("")
        }
            ml = MenuLevel.MAIN_MENU
            displayMainMenu()
    }


    fun fill(input: String) {
        if(ml == MenuLevel.MAIN_MENU && input == "fill"){
        ml = MenuLevel.SUB_FILL_WATER
        println("Write how many ml of water do you want to add: ")
        }
         else if(ml == MenuLevel.SUB_FILL_WATER){
                val waterAdded = input.toInt()
                water  +=  waterAdded
                ml = MenuLevel.SUB_FILL_MILK
                println("Write how many ml of milk do you want to add: ")
            }
            else if (ml == MenuLevel.SUB_FILL_MILK) {
                val milkAdded = input.toInt()
                milk += milkAdded
                ml = MenuLevel.SUB_FILL_BEANS
                println("Write how many grams of coffee beans do you want to add: ")
            }
            else if (ml == MenuLevel.SUB_FILL_BEANS) {
                val beansAdded = input.toInt()
                beans += beansAdded
                ml = MenuLevel.SUB_FILL_CUPS
                println("Write how many disposable cups of coffee do you want to add: ")
            }
            else if(ml == MenuLevel.SUB_FILL_CUPS) {
                val cupsAdded = input.toInt()
                cups += cupsAdded
                ml = MenuLevel.MAIN_MENU
                displayMainMenu()
        }

    }

    fun buy(input: String){
        if(ml == MenuLevel.MAIN_MENU && input == "buy") {
            displayBuyOption()
            ml = MenuLevel.SUB_BUY
        }else if (ml == MenuLevel.SUB_BUY && input == "1"){
            if (water > 250 && milk > 0 && beans > 16 && cups > 1) {
                println("I have enough resources, making you a coffee!")
                water -= 250
                milk -= 0
                beans -= 16
                cups -= 1
                cash += 4
            }  else if (water < 250) println("Sorry, not enough water!")
               else if (beans < 16) println("Sorry,not enough beans!")
           // displayBuyOption()
            ml = MenuLevel.MAIN_MENU
            displayMainMenu()
        } else if (ml == MenuLevel.SUB_BUY && input == "2"){
            if (water > 350 && milk > 75 && beans > 20 && cups > 1) {
                        println("I have enough resources, making you a coffee!")
                        water -= 350
                        milk -= 75
                        beans -= 20
                        cups -= 1
                        cash += 7
                }   else if (water < 350) println("Sorry, not enough water!")
                    else if (milk < 75) println("Sorry,not enough milk!")
                    else if (beans < 16) println("Sorry,not enough beans!")
             //displayBuyOption()
                    ml = MenuLevel.MAIN_MENU
                    displayMainMenu()
                }else if (ml == MenuLevel.SUB_BUY && input == "3"){
            if (water > 200 && milk > 100 && beans > 12 && cups > 1) {
                        println("I have enough resources, making you a coffee!")
                        water -= 200
                        milk -= 100
                        beans -= 12
                        cups -= 1
                        cash += 6
                    }   else if (water < 200) println("Sorry, not enough water!")
                        else if (milk < 100) println("Sorry,not enough milk!")
                        else if (beans < 12) println("Sorry,not enough beans!")
                        ml = MenuLevel.MAIN_MENU
                        displayMainMenu()
                }    else if(ml == MenuLevel.SUB_BUY && input =="back"){
                ml = MenuLevel.MAIN_MENU
                displayMainMenu()
        }
    }

}

fun displayMainMenu(){
    println("Write action (buy,fill,take,remaining,exit): ")
}

fun displayBuyOption() {
    println("What do you want to buy? 1- expresso, 2- latte , 3 - cappuccino , back: ")
}

enum class MenuLevel (val level: String, val cat: String) {
    MAIN_MENU ("main menu",""),
    SUB_FILL_WATER("sub fill water","fill"),
    SUB_FILL_MILK("sub fill milk","fill"),
    SUB_FILL_BEANS("sub fill beans","fill"),
    SUB_FILL_CUPS("sub fill cups","fill"),
    SUB_BUY("buy", ""),
    SUB_REMAINING("remaining",""),
    SUB_TAKE("take","");
}




