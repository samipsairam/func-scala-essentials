package exercises.oop

object NovelWriter extends App {

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(author.fullname)

  // COUNTER TEST
  val counter = new Counter()
  counter.incr.print
  counter.incr.incr.incr.print
  counter.incr(10).print



}
