import scala.collection.mutable.ArrayBuffer

"New York".partition(_.isUpper)

val (neg, pos) = ArrayBuffer[Int](1,2,-4,5,2,3,-9,9,-2,-5).partition(_<0)

val result = pos

result += neg(0)


val symbols = Array("<", "-", ">")
val counts = Array(2,6,2)
val pairs = symbols.zip(counts)

for(p <- pairs) print(p._1 * p._2)

for ((s,n) <- pairs) print(s*n)