class Director(val first: String = "first",
               val last : String = "last"
               ,val yearOfBirth : Int){
  def name (): String ={
    first + last
  }

  def copy(
            firstName: String = this.first,
            lastName: String = this.last,
            yearOfBirth: Int = this.yearOfBirth) =
    new Director(firstName, lastName, yearOfBirth)
}

object Director{
  def apply(first: String
  = "first", last: String = "last",yearOfBirth: Int
  ): Director = new Director(first,last,yearOfBirth
  )

  def older(dir1 : Director,dir2 : Director) : Director = {
  if(dir1.yearOfBirth > dir1.yearOfBirth)
    dir1
    else
    dir2
  }
}

class Film(val name: String,val yearOfRelease : Int,
           val imdbRating : Double
           ,val director : Director){
  def directorsAge(director : Director):Int = {
    director.yearOfBirth - yearOfRelease
  }
  def isDirectedBy(directorr : Director):Boolean = {
    if(director.name.equals(directorr.name()))
      true
    else false
  }

  def copy(name : String = this.name,
           yearOfRelease : Int = this.yearOfRelease,
           imdbRating : Double = this.imdbRating,
           director : Director = this.director) :
  Film =
  {new Film(name,yearOfRelease,imdbRating,director)}
}

object Film{
  def apply(name: String, yearOfRelease: Int, imdbRaiting: Double, director: Director
           ): Film = new Film(
    name, yearOfRelease, imdbRaiting, director
  )

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