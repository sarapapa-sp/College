fun main() {
    println("Enter your name :")
    val name= readLine()!!

    println("Good morning $name 😊")

        println("We heard you want to lose the weight  $name \uD83D\uDC40")
        println("y or n")

        val case = readLine()!!
        if(case == "y"){
            println("We have brought just for you")
            println("Weight Loss with proper Diet and Exercise App for you 🎽")
            println("Are you interested to know more about the app $name which can help you to achieve your goal ...")
            println("y or n")
            val case2 = readLine()!!
            if(case2 == "y"){
                println("Features of App -> \n\t -> keeps the track of your daily exercise \n\t -> keeps the track of your diet")
                println("\t -> Will suggest the better diet everyday for you \n\t -> Just one click away from you\n\t")
                println("\t -> Add  the Goals to your account and achieve it everyday")
                println("Lose It! is a calorie counter & food diary diet app that helps you stick to your diet and  \n achieve weight loss that fits! Simply download the app, set your goals and track your diet, \n food and exercises to lose weight. ")
                println("So are you ready to lose your Weight 📈")
                println("y or n")
                val case3 = readLine()!!
                if(case3 == "y"){
                    println("Just download the app and you are good to go 👩‍🚀 🧑‍✈ 👨‍✈ ' $name '")
                }else{
                    println("Mota he rahegalo tu $name")
                }
            }else{
                println("Mota he rahega tu $name")
            }
        }else{
            println("Tere se na ho payega bhai $name")
        }
}