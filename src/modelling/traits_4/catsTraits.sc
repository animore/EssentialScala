trait Feline{
  def colour : String
  def sound : String
}

case class Lion(maneSize: Int) extends Feline {
  override def colour: String = "GoldenBrown"

  override def sound: String = "Roar"
}

case class Cat(favFood : String) extends Feline {
  override def colour: String = "White"

  override def sound: String = "Meow"
}

val cat = Cat("Chips")
cat.colour