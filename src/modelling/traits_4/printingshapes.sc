sealed trait Shapes{
  def sides: Int
  def perimeter: Double
  def area: Double
}

trait Rectangular extends Shapes{

  def height: Double
  def width: Double

  override def sides: Int = 4

  override def perimeter: Double = 2*width + 2*height

  override def area: Double = width*height
}


case class Rectangle(length:Double,breadth:Double) extends Rectangular{
  override def height: Double = length

  override def width: Double = breadth
}

case class Square(side: Double) extends Rectangular {
  override def height: Double = side

  override def width: Double = side
}

case class Circle(radius: Double) extends Shapes {
  override def sides: Int = 0

  override def perimeter: Double = 2*math.Pi*radius

  override def area: Double = math.Pi*(radius*radius)
}


object Draw{
  def apply(shape: Shapes): String = shape match {
    case Rectangle(length,breadth) => "Its a Rectangle with length "+length +" and breadth "+breadth
    case Square(side) => "Its a Square with side as "+side
    case Circle(radius) => "Its a Circle with radius as "+radius
    case _ => "Not a Rectangular Shape"
  }
}

Draw.apply(Square(5))
//Draw.apply(Circle(6))