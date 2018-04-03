val salaries = Seq(1000,2000,3000)
def doubleIt (value : Int) : Int = value * 2

val newSal = salaries.map(x=> doubleIt(x))
println(newSal.foreach(e=>println(e)))

val doubleval = (x: Int) => x*2

//lazy val doubleSal = salaries.map(doubleSal)

def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(x: Int, acc: Int): Int = {
    if (x > b) acc
    else loop(x + 1, acc + f(x))
  }
  loop(a,b-10)
}
sum(x => x, 1, 10)


//--------

def halfMaker(value:Int):Double=value.toDouble/2
def addFive(value:Int):Int=value+5

def processRange(start:Int,end:Int,processor:Int=>AnyVal):Unit={
  for(i<-start to end)
    println(processor(i))
}

//processRange(1,5,halfMaker(9))

