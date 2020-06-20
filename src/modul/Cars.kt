package modul

class Cars constructor(x: Int, y: Int, fuel: Int, facing: Int){
    var xCoor: Int=x
    var yCoor: Int=y
    var fuelCar: Int = fuel
    var facingDir: Int = facing
    var engineStatus: String = "OFF"
        private set

    fun startEngine(){
        if (fuelCar>0) {
            engineStatus = "ON"
            println("Engine Started, status $engineStatus")
            return
        }
        println("Engine Fail to Start, fuel is empty")
    }

    fun navigation(moved: String?) {
        if (moved == "F") {
            if (fuelCar==0){
                println("Fuel Empty, can't continue the trip")
            } else{
                forward()
            }
        }
        if (moved == "R"){
            turnRight()
        }
        if (moved == "L"){
            turnLeft()
        }
    }
    private fun turnRight(){
        println("Turn Right")
//        var tRight = Int

        // (destination + current)%4
    }
    private fun turnLeft(){
        println("Turn Left")
        // (((destination*3) + current)%4)
    }
    private fun forward(){
        println("Forward")
//        var destLocs = Int
        when(facingDir) {
            0 -> yCoor.plus(1)
            1 -> xCoor.plus(1)
            2 -> yCoor.minus(1)
            3 -> xCoor.minus(1)
        }
    }

    override fun toString(): String {
        return "Cars(xCoor=$xCoor, yCoor=$yCoor, fuelCar=$fuelCar, facingDir=$facingDir, engineStatus='$engineStatus')"
    }

//    private fun fuelVal(fuel: Int){
////        println("Fuel Val")
//        if (fuelCar==0){
//            println("Fuel Empty")
//        }
//    }


//    fun charArrayOf(letsGo: String?) {
//        var inputMove = readLine()
//    }


}