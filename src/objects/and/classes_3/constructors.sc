class Person(first : String,last : String){
  val firstName = first
  val lastName = last
}

val p = new Person("ani","more")
p.firstName
p.lastName

val bro = new Person("sagar","more")
bro.firstName
bro.lastName

//default and keyword parameters

val test = new Person(last = "Last", first = "First")

def greet(firstName: String = "Some", lastName: String
= "Body") = "Greetings, " + firstName + " " +
  lastName + "!"

greet(test.firstName)

greet("Awesome")