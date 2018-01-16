class CounterClass(val counterNumber : Int){
  val count : Int = counterNumber
  def increment(incnumber : Int = 1) : CounterClass =
  {
    val newCount = incnumber + count
    new CounterClass(newCount)}

  def decrement(decnumber : Int = 1) : CounterClass =
  { val newCount = count - decnumber
    new CounterClass(newCount)}

  def adjust(adder : Adder) : CounterClass = {
    new CounterClass(adder.add(count))
  }
}


class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

val c = new CounterClass(10)

c.increment(5).decrement(2).count

val c1 = new CounterClass(20)
val a1 = new Adder(5)
c1.adjust(a1).count


c.increment(5).decrement(2).adjust(a1).count