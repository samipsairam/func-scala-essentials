package lectures.part2oop

object OOBasics extends App{

  // instantiating class
  val person = new Person("Daniel", 26)
  // println(person.age)    // age is a class parameter not a class member so it cannot be accessed with . operator
  // if we want to CONVERT CLASS PARAMETERS to CLASS FILEDS add val/val to it
  println(person.age)
  println(person.DEFAULT_AGE)
  person.greet("Samip")
  person.greet()
  person.greet("Rohan","Austin",29)
  person.greet("Honda", 2010)


}

// class defination
// below is a class constructor {Every instance must have mentioned parameters in a constructor}
class Person(name: String, val age: Int) {

  // class body {val/var definition, function definition or methods, expressions, other definitions}
  val DEFAULT_AGE = 100
  // every single expressions or side-effects are executed on each instantiation
  println(s"This will always be executed when every instantiation of call")
  // defining method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")  // this is utilized to access instance field

  // if parameters with same name is passed then we need to use this. to refer to the instance field else passed parmeter is used
  // if parameter name is different then method always uses this.{instance_filed}
  def greet(): Unit = println(s"I am the instance field: ${name.toUpperCase}")

  // OVERLOADING: defining method with same names but with different signatures(params list)
    // def greet(): Int = 42   // gives compile error
  def greet(name: String, cityName: String, age: Int): Unit = println(s"$name and Instructor ${this.name} are both from $cityName and are $age years old.")
  def greet(vehicleType: String, year: Int): Unit = println(s"$name has $vehicleType of year $year")

  // CONSTRUCTOR OVERLOADING
  def this(name: String) = this(name, 0)



}

// class parameters are NOT FIELDS  to make them field we need to add 'val/var' to the parameter name