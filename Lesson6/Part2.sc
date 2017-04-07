1.to(10).reduceLeft(_ * _)

val fact = (n: Int) => 1.to(n).reduceLeft(_ * _)

fact(10)

//List.fill(10)(2).reduceLeft(_*_)

1.to(10).map(_=>2).reduceLeft(_*_)

val pow = (a: Int, b: Int) => 1.to(b).map(_=>a).reduceLeft(_ * _)

pow(2,10)

def concat(strings: Seq[String], separator: String) : String = {
  strings.reduceLeft(_ + separator + _)
}

concat(Array("Mary", "had", "a", "little", "lamb"), " ")


