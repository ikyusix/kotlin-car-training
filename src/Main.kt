import modul.Cars

fun main(){
    println("+========== WELCOME TO ==========+")
    println("    _   _____________\n" +
            "   / | / / ____/ ___/\n" +
            "  /  |/ / /_   \\__ \\ \n" +
            " / /|  / __/  ___/ / \n" +
            "/_/ |_/_/    /____/  \n" +
            "                     ")
    println("[+]===== Where your location? =====[+]")
    print("[+] X Point: ")
    var inputX = readLine()!!.toInt()
    print("[+] Y Point: ")
    var inputY = readLine()!!.toInt()
    print("[+]======== Your direction: =======[+] \n")
    val directions = arrayOf("NORTH", "EAST", "SOUTH", "WEST")
    var i = 1
    for (direction: String in directions) {
        println("[+] $direction\t" + i++)
    }
    println()
    print("[+] where are you looking at: ")
    var inputDirec = readLine()!!.toInt()
    print("[+] How much fuel you have: ")
    var inputFuel = readLine()!!.toInt()
    var lamborghini = Cars(inputX,inputY,inputFuel,inputDirec)
    lamborghini.startEngine()
    println()
    println("[+]========== Navigation ==========[+]")
    println("[+] Forward\t\t[F]")
    println("[+] Turn Right\t[R]")
    println("[+] Turn Left\t[L]")
    println("[+]=== Where do you want to go? ===[+]")
    var letsGo = readLine().toUpperCase()
    for (i in letsGo.indices){
        letsGo.substring(i, i+1)
    }
//    if (letsGo != null) {
//        for (i in letsGo.indices){
//            letsGo.substring(i, i+1)
//        }
//    }
    lamborghini.navigation(letsGo)
    println()
    println(lamborghini.toString())

}
