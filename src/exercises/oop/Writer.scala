package exercises.oop

class Writer(firstName: String, surName: String, val yearOfBirth: Int) {

  // full name method in class
  def fullname: String = firstName + " " + surName

}
