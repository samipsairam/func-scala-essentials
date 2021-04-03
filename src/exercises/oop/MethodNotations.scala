package exercises.oop

object MethodNotations extends App {

  class Person(val name: String, favMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favMovie

    // INFIX-notation
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favMovie)

    // PREFIX-notation
    def unary_- : String = s"$name, what the heck is this?"
    def unary_+ : Person = new Person(name, favMovie, age + 1)

    // POSITFIX-notation
    def isAlive: Boolean = true
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"

    // apply methods
    def apply(): String = s"Hi, my name is $name and I like $favMovie"
    def apply(n: Int): String = s"$name watched $favMovie $n times "

  }

  val mary = new Person("Mary", "Inception")
  val tom = new Person("Tom", "Fight Club")


  // INFIX notation only works with methods with 1 parameters and can be used as (object method parameter)
  // INFIX-notation calls
  println(mary + tom)
  println(mary.+(tom))
  println((mary + " the RockStar") ())

  // PREFIX(Unary) only allowed for +,-,!,~
  println((+mary).age)

  // POSTFIX only for methods with no parameters
  println(mary isAlive)
  println(mary learns("Java"))
  println(mary learnsScala)

  // APPLY method calls objects like functions
  println(mary())
  println(mary(5))
}