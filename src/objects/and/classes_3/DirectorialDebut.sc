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

class Film(val name: String,val yearOfRelease : Int,
           val imdbRaiting : Double
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
  imdbRaiting : Double = this.imdbRaiting,
  director : Director = this.director) :
  Film =
    {new Film(name,yearOfRelease,imdbRaiting,director)}
}

val eastwood= new Director("Clint", "Eastwood", 1930)
val mcTiernan = new Director("John", "McTiernan", 1951)
val nolan = new Director("Christopher", "Nolan", 1970)
val someBody= new Director("Just", "Some Body", 1990)
val memento = new Film("Memento", 2000, 8.5, nolan)
val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
val inception = new Film("Inception", 2010, 8.8, nolan)
val highPlainsDrifter= new Film("High Plains Drifter", 1973, 7.7, eastwood)
val outlawJoseyWales  = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
val unforgiven= new Film("Unforgiven", 1992, 8.3, eastwood)
val granTorino= new Film("Gran Torino", 2008, 8.2, eastwood)
val invictus= new Film("Invictus", 2009, 7.4, eastwood)
val predator= new Film("Predator", 1987, 7.9, mcTiernan)



val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)
eastwood.yearOfBirth         // should be 1930
dieHard.director.name        // should be "John McTiernan"
invictus.isDirectedBy(nolan) // should be false
invictus.isDirectedBy(eastwood) // should be true



highPlainsDrifter.copy(name = "L'homme des hautes plaines")
// returns Film("L'homme des hautes plaines", 1973, 7.7, /* etc */)
thomasCrownAffair.copy(yearOfRelease = 1968, director = new Director("Norman", "Jewison", 1926))
// returns Film("The Thomas Crown Affair", 1926, /* etc */)
inception.copy().copy().copy()
// returns a new copy of `inception`







