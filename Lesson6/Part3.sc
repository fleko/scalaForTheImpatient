

def While1(condition: () => Boolean, block: () => Unit) {
  if (condition()) {
    block(); While1(condition,block)
  }
}

val n1 = 10
var i1 = 1
var f1 = 1

While1(() => i1 < n1, () => { f1 *= i1; i1 += 1 })



def While2(condition: => Boolean, block: => Unit) {
  if (condition) {
    block; While2(condition,block)
  }
}

val n2 = 10
var i2 = 1
var f2 = 1

While2(i2 < n2, { f2 *= i2; i2 += 1 })

def While3(condition: => Boolean)(block: => Unit) {
  if (condition) {
    block; While3(condition)(block)
  }
}

val n3 = 10
var i3 = 1
var f3 = 1

While3(i3 < n3) { f3 *= i3; i3 += 1 }

