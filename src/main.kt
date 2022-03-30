fun main(){
   var car=Car("Jeep","Gladiator","Blue",7)
    car.carry(40)
    car.Identity()
    println(car.calculatingParkingFees(15))
    println(bus.calculatingParkingFees)




}
 open class Car(var make:String,var model:String,var color:String,var capacity:Int){
   fun carry(people:Int): Int {
       var x=people
       if (people==x){

       println("carrying $people passangers")
       }
       else{
         println ("over  capacityc by $people")
       }
       return x
   }

    fun Identity(){
        println("I am $color $make $model.")
    }
    fun calculatingParkingFees(hours:Int):Int{
     var ans=hours*20
        return ans
    }
}
class Bus(var make:String,var model:String,var color:String,var capacity:Int){
    fun TrippleFare() {
      return TrippleFare()
    }
}
     override fun calculatingParkingFees(){
     super.calculatingParkingFees
         return calculatingParkingFees()


     }
