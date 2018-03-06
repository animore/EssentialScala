trait Shape{
  def sides: Int
  def perimeter: Double
  def area: Double
}

case class Circle(radius: Double) extends Shape {
  override def sides: Int = 0

  override def perimeter: Double = 2*math.Pi*radius

  override def area: Double = math.Pi*(radius*radius)
}

case class Rectangle(length:Double,breadth:Double) extends Shape{
  override def sides: Int = 4

  override def perimeter: Double = 2*(length+breadth)

  override def area: Double = length*breadth
}

case class Square(side: Double)extends Shape {
  override def sides: Int = 4

  override def perimeter: Double = 4*side

  override def area: Double = side*side
}

val circle = Circle(5)
circle.area

val square = Square(4)
square.perimeter