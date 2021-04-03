package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favMoive: String) {
    def likes(movie: String): Boolean = (movie == favMoive)
    // INFIX-notation
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    // def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    // PREFIX-notation
    def unary_! : String = s"$name, what is this?"
    // POSTFIX-notation
    def isAlive: Boolean = true
    // APPLY method
    def apply(): String = s"Hi, my name is $name I like $favMoive"

  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")     // INFIX NOTATION: only works with objects with single params

  // OPERATORS in Scala
  val tom = new Person("Tom", "Flight Club")
  //println(mary hangOutWith tom)
  // ALL OPERATORS ARE METHODS in Scala
  // INFIX-notations are Syntactic Sugar
  println(mary + tom)
  println(mary.+(tom))

  // Akka actors have ! ? as methods

  // PREFIX-notation
  val x = -1       // - is Unary operators and is equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ ! operators
  println(!mary)   // equivalent ot mary.unary_!

  // POSTFIX-notation
  println(mary.isAlive)
  println(mary isAlive)    // Syntactic Sugar  only available with method without parameters

  // APPLY
  println(mary.apply())
  println(mary())         // Syntactic Sugar:   apply can be called just by parenthesis
}
