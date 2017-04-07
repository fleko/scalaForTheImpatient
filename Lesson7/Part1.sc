val tuple1 = ('a','b')

def swapTuple(tuple:(Char, Char)) = tuple match { case (x, y) => (y,x) }

swapTuple(tuple1)



val array1 = Array('a')
val array2 = Array('a', 'b')
val array3 = Array('a', 'b', 'c')

def swapArray(array: Array[Char]) = {
  array match {
    case Array(x, y, rest@_*) => Array(y, x) ++ rest
    case _ => array
  }
}

swapArray(array1)
swapArray(array2)
swapArray(array3)


