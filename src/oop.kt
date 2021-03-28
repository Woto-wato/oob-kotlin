fun main(){
    var human=Mary("woto","19",42.5)
    println(human.name)
    println(human.weight)
    println(human.speak(""))
    var woto=User("woto","wato","wotowato@gmail.com",78678,"woto")
    println(woto.firstName)
    println(woto.email)


}
class Mary(var name:String, var age:String, var weight:Double) {
    fun eat(foodWeight:Int):Double{
        println("I am eating $foodWeight kg of food")
        weight=foodWeight+weight
        return weight
    }
    fun speak(speech:String):String{
        return speech
    }
    fun birthday(age: Int) {
        println(age)
    }
}

data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String)
{

}