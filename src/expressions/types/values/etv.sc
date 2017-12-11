1 + 2

"3".toInt

//"yo".toInt

"My name is aniket more" split " "

"to".take(1)

123L

42.0f

println("hey")

object Test{}

Test

object Test2{
  def name : String = "Excercises in chap2"
}

Test2.name

object  Test3{
  val other="Vick"
  def hello(name : String) =
    other +" says hello to " + name
}

Test3.hello("more")

//Introducing Fields

object  Test4{
  val simpleField = { println("Evaluating simpleField")
  42}

  def noParametermMethod = {
    println("Evaluating noParameter")
    42
  }
}

//Test4

Test4.simpleField
Test4.simpleField
Test4.noParametermMethod
