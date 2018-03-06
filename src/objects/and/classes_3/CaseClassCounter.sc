case class Counter(count : Int = 0){
  def inc = copy(count = count + 1)
  def dec = copy(count = count - 1)
//  def adjust(adder : Adder) = copy(count = adder(count))
}


//class Adder(amount: Int) {
//  def add(in: Int) = in + amount
//}
//
//object Adder {
//  def apply(count : Int): Adder = new Adder(count)
//}


Counter(0)

Counter().inc

Counter().inc.dec == Counter().dec.inc

//----

case class Person(firstname : String,lastname : String){
  def name = firstname + " " + lastname
}

object Person{
  def apply(name : String): Person = {
    val parts = name.split(" ")
    new Person(parts(0),parts(1))
  }
}

object BestFootballer{
  def awards(person : Person) : String =
    person match {
      case Person("Lionel","Messi") => "You are the greatest footballer"
      case Person("Cristiano","Ronaldo") => "You aint even close to greatest footballer"
      case Person("Neymar","Silva") => "Good but not best"
      case _ => "Unknown Footballer"
    }
}

BestFootballer.awards(Person("Lionel","Messi"))