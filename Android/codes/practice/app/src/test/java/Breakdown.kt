
fun main(){
    println("<-- Vehicle Breakdown System -->")
    println("<-- Stuck at the remote location -->")


    println("<-- Would you like to call mechanical at just on click -->")
    println("y or n")
    val case:String = readLine()!!

    if(case == "n"){
        return
    }


        println("Would you like to enter the location")
        println("y or n")
        val case2:String = readLine()!!
        val location:String?
        if (case2 == "y"){
            location= readLine()!!
        }else{
            println("Your location will be taken by GPS")
            println("Opening your GPS")
            println("Getting your location")
            location="Amity , Bhatan pada"
        }

        println("Looking for nearest Mechanic")
        println("........")
        println(".....")
        val mechanic:String = "Ramu Kaka"
        println("$mechanic will reach to your location soon")

        println("Thank you for booking mechanic with us")


}