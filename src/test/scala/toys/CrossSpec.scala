import org.scalatest._
import toys.Cross._

class CrossSpec extends FunSuite {
  test("Cross.intToLine") {
    assert(intToLine(4)(4) == List('#', ' ', ' ', ' ', '#'))
  }
  // println(cross(11))
}
