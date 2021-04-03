package exercises.oop

class Counter (val count: Int = 0){
  // methods
  def incr: Counter = {
    println("Incrementing")
    new Counter(count + 1)
  }   // immutability

  def decr: Counter = {
    println("Decrementing")
    new Counter(count - 1)
  }

  // overloaded counter methods with params
  def decr(decrBy: Int): Counter = {
    if (decrBy <= 0) this
    else decr.decr(decrBy-1)
  }

  def incr(incrBy: Int): Counter = {
    if (incrBy <= 0) this
    else incr.incr(incrBy - 1)
  }

  def print = println(count)

}
