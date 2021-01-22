import scala.annotation.tailrec

object FibonacciNumber {
  def fib(n: Int): BigInt = {
    require(n >= 0)
    if (n < 2) return n
    var prev = BigInt(0)
    var cur = BigInt(1)
    for (_ <- 2 to n) {
      val tmp = cur
      cur = prev + cur
      prev = tmp
    }
    cur
  }

  def fibWithRec(n: Int): BigInt = {
    if (n == 0 || n == 1) return n
    require(n >= 0)
    fibWithRec(n - 1) + fibWithRec(n - 2)
  }

  def fibWithTailRec(n: Int): BigInt = {
    if (n == 0 || n == 1) return n
    require(n >= 0)
    fibTailRec(0, 1, n - 1)
  }

  @tailrec
  private def fibTailRec(prev: BigInt, cur: BigInt, n: Int): BigInt = {
    if (n == 0) return cur
    fibTailRec(cur, prev + cur, n - 1)
  }

}
