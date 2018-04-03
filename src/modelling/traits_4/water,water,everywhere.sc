trait source
case object well extends source
case object tap extends source
case object spring extends source
final case class waterbottle(size:Int,sr:source,carbonated:Boolean)

val springwater = spring
val aquafina = new waterbottle(20,springwater,false)

aquafina.sr



