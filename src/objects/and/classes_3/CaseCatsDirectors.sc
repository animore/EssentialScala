case class Cat(val color : String,val food : String)

case class Director(firstname : String,lastname : String,yearOfBirth : Int){
  def name =  s"$firstname $lastname"
}

object Director{
  def older(dir1 : Director,dir2 : Director) : Director = {
    if(dir1.yearOfBirth > dir2.yearOfBirth)
      dir1
    else
      dir2
  }
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

object Film{

  def newer(film1: Film, film2: Film): Film =
    if (film1.yearOfRelease < film2.yearOfRelease) film1 else film2

  def highestRating(f1 : Film,f2 : Film) : Double = {
    if(f1.imdbRating > f2.imdbRating)
      f1.imdbRating
    else
      f2.imdbRating
  }

  def oldestDirectorAtTheTime(f1 : Film,f2 : Film) : Director = {
    if(f1.yearOfRelease > f2.yearOfRelease)
      f1.director
    else
      f2.director
  }
}