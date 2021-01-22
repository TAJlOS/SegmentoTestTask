import org.scalatest.funsuite.AnyFunSuite

class TreeGeneratorSuite extends AnyFunSuite {
  test("pass tree without root should produce IllegalArgumentException") {
    val points = Seq(Point("a", "a"))
    assertThrows[IllegalArgumentException] {
      TreeCreator.createTree(points)
    }
  }

  test("pass tree with one vertex") {
    val points = Seq(Point("a", null))
    val tree = TreeCreator.createTree(points)
    val test = Seq(Node(Point("a", null), Seq[Node]()))
    assert(tree == test)
  }

  test("pass tree with three vertices") {
    val points = Seq(Point("a", null), Point("b", "a"), Point("c", "a"))
    val tree = TreeCreator.createTree(points)
    val child1 = Node(Point("b", "a"), Seq[Node]())
    val child2 = Node(Point("c", "a"), Seq[Node]())
    val root = Node(Point("a", null), Seq[Node](child1, child2))
    val test = Seq(root, child1, child2)
    var result = test.size == tree.size
    for (v <- tree; if result) {
      var flag = false
      for (t <- test) {
        if (t.point == v.point && t.children.toSet == v.children.toSet) {
          flag = true
        }
      }
      if (!flag) result = false
    }
    assert(result)
  }
}
