import java.util.Scanner

val in = new Scanner(new java.net.URL("http://www.horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream)
val count = scala.collection.mutable.Map[String, Int]()
while (in.hasNext) {
  val word = in.next();
  count(word) = count.getOrElse(word,0) + 1
}

count("Alice")
count("Rabbit")

val in1 = new Scanner(new java.net.URL("http://www.horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream)
var count1 = Map[String, Int]()
while (in1.hasNext) {
  val word = in1.next();
  count1 = count1 + (word -> (count1.getOrElse(word,0) + 1))
}

count1("Alice")
count1("Rabbit")