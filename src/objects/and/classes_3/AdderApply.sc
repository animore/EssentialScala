class Adder(amount : Int) {
  def apply(in: Int): Int = in + amount
}

val add3 = new Adder(5)

add3(6)