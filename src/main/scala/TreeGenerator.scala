import scala.collection.mutable

case class Point(id: String, parentId: String)

case class Node(point: Point, children: Seq[Node])

object TreeCreator {
  def createTree(points: Seq[Point]): Seq[Node] = {
    val vertices = points.map(p => p.id -> p).toMap
    val tree = vertices.keys.map(key => key -> mutable.Buffer[Point]()).toMap
    var root: Point = null
    for (p <- vertices.keys) {
      val v = vertices(p)
      if (v.parentId != null) {
        tree(v.parentId) += v
      } else {
        root = v
      }
    }
    if (root == null) throw new IllegalArgumentException()
    val nodes = mutable.Buffer[Node]()
    createNode(root, tree.map(p => vertices(p._1) -> p._2.toSeq), nodes)
    nodes.toSeq
  }

  private def createNode(point: Point, tree: Map[Point, Seq[Point]], nodes: mutable.Buffer[Node]): Node = {
    val buffer = mutable.Buffer[Node]()
    for (child <- tree(point)) {
      buffer += createNode(child, tree, nodes)
    }
    val result = Node(point, buffer.toSeq)
    nodes += result
    result
  }
}

