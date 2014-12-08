package codewars

object Multi3And5 {
  // http://www.codewars.com/kata/multiples-of-3-and-5

  def solution(upper: Int) = {
    if (upper < 1)
      throw new IllegalArgumentException("argument should be greater than one")

    (1 until upper).filter(x => { x % 3 == 0 || x % 5 == 0 }).foldLeft(0)(_ + _)
  }
}
