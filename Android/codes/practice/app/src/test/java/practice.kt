fun main() {

    println("<---Faculty Snacks Delivery--->")
    println("<-------MRC ------->")
    println("<-------Want snacks delivered at your table book now------->")
    println("<-------y or n------->")
    val mainCase:String = readLine()!!
    if(mainCase == "n"){
        println("<-------Thank you for your response ------->")
        println("Come back to us when you are bored to come to canteen")
        return
    }
    var cost:Int = 0
    val items = mutableListOf("Your ordered products are : ")
    while(true){
        println("1  Smodh    10rs")
        println("2  Frooti    10rs")
        println("3  Bourbon    10rs")
        println("4  Bourbon    30rs")
        println("5  Oreo    10rs")
        println("6  Oreo    20rs")
        println("7 Proceed to payout")

        val case = readLine()
        when(case?.toInt()){
            1 -> {
                cost += 10
                items.add("Smodh")
                println("Order noted -> 1 smoodh 10rs")
            }
            2 -> {
                cost += 10
                items.add("Frooti")
                println("Order noted -> 1 Frooti 10rs")
            }
            3 -> {
                cost += 10
                items.add("Bourbon")
                println("Order noted -> 1 Bourbon 10rs")
            }
            4 -> {
                cost += 30
                items.add("Bourbon")
                println("Order noted -> 1 Bourbon 30rs")
            }
            5->{
                cost += 10
                items.add("Oreo")
                println("Order noted -> 1 Oreo 10rs")
            }
            6 -> {
                cost += 10
                items.add("Oreo")
                println("Order noted -> 1 Oreo 20rs")
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
    println("Faculty Name :")
    val name:String = readLine()!!
    println("Faculty School")
    val school:String = readLine()!!
    println("Staff Room Number / Room No  :")
    val staffRoomNumber:String = readLine()!!

    for(item in items){
        println(item)
    }
    println()
    println("Your snacks of Rs $cost will be delivered to you at $staffRoomNumber shortly ...")

}
