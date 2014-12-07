package toys

object Cross {
  /**
   * convert int represent line number to a List[Char]
   * as content in the line of a cross
   */
  def intToLine(linNum: Int, col: Int): List[Char] = {
    val nonEmptyPos = List(linNum, col - linNum)

    (0 until col).map(x => {
      if (nonEmptyPos contains x) '#'
      else ' '
    }).toList
  }
}
