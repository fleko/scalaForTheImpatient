import scala.collection.mutable.ArrayBuffer

var b = ArrayBuffer[Int](1,2,-4,5,2,3,-9,9,-2,-5)

var c = for (i <- 0 until b.length if b(i) < 0) yield i

c = c.drop(1)

c = c.reverse

for (j <- 0 until c.length) b.remove(c(j))

b


val buf = ArrayBuffer[Int](1,2,-4,5,2,3,-9,9,-2,-5)

def removeAllButFirstNeg(buf: ArrayBuffer[Int]) = {
  val indexesToRemove = (for (i <- 0 until buf.length if buf(i) < 0) yield i).drop(1)
  for (i <- 0 until buf.length if !indexesToRemove.contains(i)) yield buf(i)
}

removeAllButFirstNeg(buf)