package exercises.oop

class Novel (name: String, yearOfRelease: Int, author: Writer) {

  def authorAge = yearOfRelease - author.yearOfBirth

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(name,newYearOfRelease,author)

}
