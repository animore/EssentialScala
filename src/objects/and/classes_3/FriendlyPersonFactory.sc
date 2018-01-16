class Person(val firstname : String,val lastname : String)

object Person{
  def apply(name : String): Person = {
    val parts = name.split(" ")
    new Person(parts(0),parts(1))
  }
}

Person.apply("Aniket More").firstname

Person("Aniket More").firstname

Person("Sagar More").lastname