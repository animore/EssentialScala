package trying_things

/**
  * Created by aniketmore on 12/03/18.
  */
class Process {

  def halfMaker(value:Int):Double=value.toDouble/2
  def addFive(value:Int):Int=value+5

  def processRange(start:Int,end:Int,processor:Int=>AnyVal):Unit={
    for(i<-start to end)
      println(processor(i))
  }

}


/*
object Test{
  def main(args: Array[String]): Unit ={
    val p = new Process
    p.processRange(1,6,p.halfMaker(8))
  }
}*/
