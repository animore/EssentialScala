trait Color{
  def Red:Int
  def Green:Int
  def Blue:Int
  def LightOrDark:String
}

case class Red(r:Int,g:Int,b:Int) extends Color{
  def name: String = "Red"
  override def Red: Int = r

  override def Green: Int = g

  override def Blue: Int = b

  override def LightOrDark:String=if(r>50 || g>50 || b>50) "Dark" else if(r<50 && g<50 && b<50) "Light" else "Normal"
}

case class Yellow(r:Int,g:Int,b:Int) extends Color{
  override def Red: Int = r

  override def Green: Int = g

  override def Blue: Int = b

  override def LightOrDark:String=if(r>50 || g>50 || b>50) "Dark" else "Light"
}

case class Pink(r:Int,g:Int,b:Int) extends Color{
  override def Red: Int = r

  override def Green: Int = g

  override def Blue: Int = b

  override def LightOrDark:String=if(r>50 || g>50 || b>50) "Dark" else "Light"
}

sealed trait Shapes{
  def sides: Int
  def perimeter: Double
  def area: Double
}

trait Rectangular extends Shapes with Color{

  def height: Double
  def width: Double

  override def sides: Int = 4

  override def perimeter: Double = 2*width + 2*height

  override def area: Double = width*height
}


case class Rectangle(length:Double,breadth:Double,color:Color) extends Rectangular{
  override def height: Double = length

  override def width: Double = breadth

  override def Red: Int = color.Red

  override def Green: Int = color.Green

  override def Blue: Int = color.Blue

  override def LightOrDark: String = color.LightOrDark
}

case class Square(side: Double,color:Color) extends Rectangular {
  override def height: Double = side

  override def width: Double = side

  override def Red: Int = color.Red

  override def Green: Int = color.Green

  override def Blue: Int = color.Blue

  override def LightOrDark: String = color.LightOrDark
}

case class Circle(radius: Double,color:Color) extends Shapes with Color{
  override def sides: Int = 0

  override def perimeter: Double = 2*math.Pi*radius

  override def area: Double = math.Pi*(radius*radius)

  override def Red: Int = color.Red

  override def Green: Int = color.Green

  override def Blue: Int = color.Blue

  override def LightOrDark: String = color.LightOrDark
}


object Draw{
  def apply(shape: Shapes): String = shape match {
case Rectangle(length,breadth,Red(r,g,b)) => ""
  }
}

