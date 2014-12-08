import org.scalatest._
import codewars.Multi3And5._

class Multi3And5 extends FunSuite {
  test("solution") {
    assert(23 == solution(10))
    assert(78 == solution(20))
    assert(9168 == solution(200))
  }
}
