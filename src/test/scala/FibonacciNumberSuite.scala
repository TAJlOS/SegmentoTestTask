import org.scalatest.funsuite.AnyFunSuite

class FibonacciNumberSuite extends AnyFunSuite {
  /* test cases for fib method */

  test("pass negative value to fib should produce IllegalArgumentException") {
    assertThrows[IllegalArgumentException] {
      FibonacciNumber.fib(-1)
    }
  }

  test("pass 0 to fib should return 0") {
    assert(FibonacciNumber.fib(0) == 0)
  }

  test("pass 1 to fib should return 1") {
    assert(FibonacciNumber.fib(1) == 1)
  }

  test("pass 2 to fib should return 2") {
    assert(FibonacciNumber.fib(2) == 1)
  }

  test("pass 10 to fib should return 55") {
    assert(FibonacciNumber.fib(10) == 55)
  }

  /* test cases for fibWithRec method */

  test("pass negative value to fibWithRec should produce IllegalArgumentException") {
    assertThrows[IllegalArgumentException] {
      FibonacciNumber.fibWithRec(-1)
    }
  }

  test("pass 0 to fibWithRec should return 0") {
    assert(FibonacciNumber.fibWithRec(0) == 0)
  }

  test("pass 1 to fibWithRec should return 1") {
    assert(FibonacciNumber.fibWithRec(1) == 1)
  }

  test("pass 2 to fibWithRec should return 2") {
    assert(FibonacciNumber.fibWithRec(2) == 1)
  }

  test("pass 10 to fibWithRec should return 55") {
    assert(FibonacciNumber.fibWithRec(10) == 55)
  }

  /* test cases for fibWithTailRec method */

  test("pass negative value to fibWithTailRec should produce IllegalArgumentException") {
    assertThrows[IllegalArgumentException] {
      FibonacciNumber.fibWithTailRec(-1)
    }
  }

  test("pass 0 to fibWithTailRec should return 0") {
    assert(FibonacciNumber.fibWithTailRec(0) == 0)
  }

  test("pass 1 to fibWithTailRec should return 1") {
    assert(FibonacciNumber.fibWithTailRec(1) == 1)
  }

  test("pass 2 to fibWithTailRec should return 2") {
    assert(FibonacciNumber.fibWithTailRec(2) == 1)
  }

  test("pass 10 to fibWithTailRec should return 55") {
    assert(FibonacciNumber.fibWithTailRec(10) == 55)
  }

}
