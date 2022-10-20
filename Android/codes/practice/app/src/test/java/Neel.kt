

fun main(){
//    Car 1
    var rideId1:Int = 1001
    var rideStart1:String = "Amity Panvel"
    var rideEnd1:String = "Panvel Station"
    var totalMembers1:Int = 4
    var assignedMembers1 :Int = 0
//    Car 2
    var rideId2:Int = 1002
    var rideStart2:String = "Amity Panvel"
    var rideEnd2:String = "Kharghar"
    var totalMembers2:Int = 4
    var assignedMembers2 :Int = 0

//    Car 3
    var rideId3:Int = 1003
    var rideStart3:String = "Amity Panvel"
    var rideEnd3:String = "Khandehwar"
    var totalMembers3:Int = 4
    var assignedMembers3 :Int = 0


    while(true){

        println("$rideId1  via $rideStart1 to $rideEnd1 -> Available members ${totalMembers1 - assignedMembers1}")
        println("$rideId2  via $rideStart2 to $rideEnd2 -> Available members ${totalMembers2 - assignedMembers2}")
        println("$rideId3  via $rideStart3 to $rideEnd3 -> Available members ${totalMembers3 - assignedMembers3}")
        println("Enter the ride number")
        val readCase = readLine()!!
        when(readCase.toInt()){
            1001 -> {
                if(totalMembers1 > assignedMembers1){

                    println("Do you want to confirm your booking ?")
                    println("for ride  via $rideStart1 to $rideEnd1")
                    println("y or n")
                    val confirmationOfRide = readLine()!!
                    if (confirmationOfRide == "y"){
                        println("Your ride is booked via $rideStart1 to $rideEnd1")
                        println("Enjoy your ride by making new friends ")
                        assignedMembers1 = assignedMembers1 +1
                        break
                    }
                    else{
                        println("Look for another ride then")
                    }
                }else{
                    println("No more bookings available , Please try another ride")
                }

            }
            1002 -> {
                if(totalMembers2 > assignedMembers2){

                    println("Do you want to confirm your booking ?")
                    println("for ride  via $rideStart2 to $rideEnd2")
                    println("y or n")
                    val confirmationOfRide = readLine()!!
                    if (confirmationOfRide == "y"){
                        println("Your ride is booked via $rideStart2 to $rideEnd2")
                        println("Enjoy your ride by making new friends ")
                        assignedMembers2 = assignedMembers2 + 1
                        break
                    }
                    else{

                        println("Look for another ride then")
                    }
                }else{
                    println("No more bookings available , Please try another ride")
                }
            }
            1003 -> {
                if(totalMembers3 > assignedMembers3){

                    println("Do you want to confirm your booking ?")
                    println("for ride  via $rideStart3 to $rideEnd3")
                    println("y or n")
                    val confirmationOfRide = readLine()!!
                    if (confirmationOfRide == "y"){
                        println("Your ride is booked via $rideStart3 to $rideEnd3")
                        println("Enjoy your ride by making new friends ")
                        assignedMembers3 = assignedMembers3 + 1
                        break
                    }else{
                        println("Look for another ride then")
                    }

                }else{
                    println("No more bookings available , Please try another ride")
                }
            }
            else -> {
                println()
            }
        }


    }

}