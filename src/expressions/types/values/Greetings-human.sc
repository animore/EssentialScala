
object Person{
val first_name = "Aniket"
  val last_name = "More"
}

object Alien{
  def greet  (person : Person.type ) =
    "Hello " +person.first_name + " " + person.last_name
}

Alien.greet(Person)