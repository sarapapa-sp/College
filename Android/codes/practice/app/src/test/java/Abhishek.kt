
fun main(){
    println("<---Amity Fruits Delivery--->")
    println("<-------MRC ------->")

    var cost:Int = 0
    val items = mutableListOf("Your ordered fruits are : ")
    while(true){
        println("1  Apple   10rs per piece")
        println("2  Banana 5rs per piece")
        println("3  Dragon Fruit 90rs per piece")

        2
        println("4  Guava 10rs per piece")
        println("5  Chikoo 10rs per piece")
        println("6  Grapes 10rs per piece")
        println("7 Proceed to payout")

        val case = readLine()
        when(case?.toInt()){
            1 -> {
                cost += 10
                items.add("Apple")
                println("Order noted -> 1 Apple 10rs")
                println()
            }
            2 -> {
                cost += 5
                items.add("Banana")
                println("Order noted -> 1 Banana 10rs")
                println()

            }
            3 -> {
                cost += 90
                items.add("Dragon Fruit")
                println("Order noted -> 1 Dragon Fruit 90rs")
                println()
            }
            4 -> {
                cost += 10
                items.add("Guava")
                println("Order noted -> 1 Guava 10rs")
                println()
            }
            5->{
                cost += 10
                items.add("Chikoo")
                println("Order noted -> 1 Chikoo 10rs")
                println()
            }
            6 -> {
                cost += 10
                items.add("Grapes")
                println("Order noted -> 1 Grapes 10rs")
                println()
            }
            7->{
                println("Proceeding to payout")
                break
            }
            else -> {
                println("Enter the correct input")
            }
        }


    }
    println("Student Name :")
    val name:String = readLine()!!
    println("Student Hostel")
    val hostel:String = readLine()!!
    println("Dorm Number / Room number")
    val roomNumber:String = readLine()!!

    for(item in items){
        println(item)
    }
    println()
    println("Your Fruits of Rs $cost will be delivered to you at $roomNumber shortly ...")

}