
trait Shape1{
  def sides: Int
  def perimeter: Double
  def area: Double
}

trait Rectangular extends Shape1{

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

val rec = Rectangle(7,8)
rec.area