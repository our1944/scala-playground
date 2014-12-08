package toys

object Cross {
  /**
   * convert int represent line number to a List[Char]
   * as content in the line of a cross
   */
  def intToLine(col: Int)(linNum: Int): List[Char] = {
    val nonEmptyPos = List(linNum, col - linNum)

    (0 to col).map(x => {
      if (nonEmptyPos contains x) '#'
      else ' '
    }).toList
  }

  def cross(size: Int): String = {
    if (size <= 1)
      throw new IllegalArgumentException("size should be positive and greater than one")

    if (size % 2 == 0)
      throw new IllegalArgumentException("size should be odd number")

    (0 to size - 1)
      .map(intToLine(size - 1))
      .foldLeft("")((x, y) => x + y.mkString + "\n")
  }
}
