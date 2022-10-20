
fun main(){
    val car1 = AutoMobile("Bugatti","300km/hr","All season tyre","Black ")
    val car2 = AutoMobile("Ferrari","250km/hr","Summer Tyre","Brown")
    val car3 = AutoMobile("Mercedes","320km/hr","High Performance Tyre","Black")
}

class AutoMobile(name:String,speed:String , tyres:String , color:String){

    init {
        println("Details of the Car : $name")
        println("Speed of Car -> $speed")
        println("Type of Tyre -> $tyres")
        println("Color of Car -> $color")
        println()
        println()
    }

}