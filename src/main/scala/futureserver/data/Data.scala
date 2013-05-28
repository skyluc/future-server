package futureserver.data

case class Data(items: List[Item])

object Data {
  lazy val initialData = List(
    Item("circle 1", List(Attribute("radius", "10"))),
    Item("square 1", List(Attribute("length", "5"))),
    Item("square 2", List(Attribute("length", "8"))),
    Item("rectangle 1", List(Attribute("length", "5"), Attribute("width", "10"))),
    Item("rectangle 2", List(Attribute("length", "8"), Attribute("width", "16"))),
    Item("rectangle 3", List(Attribute("length", "10"), Attribute("width", "5"))))
}