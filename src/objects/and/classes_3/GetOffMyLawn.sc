case class Director(firstname : String,lastname : String,yearOfBirth : Int){
  def name =  s"$firstname $lastname"
}

case class Film(name :String,yearOfRelease : Int,imdbRating : Double,director : Director){
  def directorsAge(director : Director):Int = {
    director.yearOfBirth - yearOfRelease
  }
  def isDirectedBy(directorr : Director):Boolean = {
    if(director.name.equals(directorr.name()))
      true
    else false
  }
}



object Dad{
  def rate(film : Film) : Double ={
    film match{
      case Film(_,_,_,Director("Client","Eastwood",_)) => 10.0
      case Film(_,_,_,Director("John","McTiernan",_)) => 7.0
      case Film(_,_,_,Director(_,_,_)) => 3.0
    }
  }
}