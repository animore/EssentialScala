//block is used when we want sequence expressions
// with side-effects

{1 ; 2 ; 3}

{
  println("Getting")
  println("Executed")
  4
}

def name : String ={
  val first : String = "Aniket"
  val last : String = "More"
  first + " " + last
}

name