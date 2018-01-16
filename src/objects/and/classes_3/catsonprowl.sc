class Cat (val color : String,val food : String){
  val col = color
  val foodie = food
}

val oswald = new Cat("White","Curry")

object ChipChop{
  def willServe(c : Cat): Boolean = {
    if (c.food == "chips")
     true
    else
    false
  }
}

ChipChop.willServe(oswald)