class TimeStamp (val seconds : Long)

object TimeStamp{
  def apply(hours: Int, minutes: Int, seconds: Int
  ): TimeStamp = new TimeStamp(
    hours*60*60 + minutes*60 + seconds
  )
}

val l = TimeStamp(1,1,1).seconds
