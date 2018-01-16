object calc{
  def squareDouble (input : Double) = input * input

  def cubes (in : Double) = in * squareDouble(in)
}


calc.squareDouble(5.0)
calc.cubes(5.0)