case class Cat (val color : String,val food : String)


object ChipChop{
  def willServe(cat : Cat): Boolean = {
   cat match{
     case Cat(_,"Chips") => true
     case Cat(_,_) => false
   }
  }
}

ChipChop.willServe(Cat("White","Chips"))

ChipChop.willServe(Cat("Black","Curry"))