abstract class DoubleOption
case class SomeDouble(double: Double) extends DoubleOption
case object NoDouble extends DoubleOption


def inv(x: Double) = if (x == 0) NoDouble() else SomeDouble(1/x)


import java.util.NoSuchElementException

import math._

def compose(f:(Double) => DoubleOption, g: (Double) => DoubleOption) = (x: Double) => g(x) match {
  case SomeDouble(result) => f(result)
  case _ => NoDouble()
}


//def mulBy(factor : Double) = (x : Double) => factor * x

def f(x: Double) = if (x <= 1) SomeDouble(sqrt(1 - x)) else NoDouble()

val h = compose(inv, f) // inv(f(x)) when defined

h(-6)


def isEmpty(doubleOption: DoubleOption) = {
  doubleOption match {
    case SomeDouble(_) => true
    case _ => false
  }
}


isEmpty(SomeDouble(5))
isEmpty(NoDouble())

def get(doubleOption: DoubleOption) = {
  doubleOption match {
    case SomeDouble(p) => p
    case _ => throw new NoSuchElementException;
  }
}

get(SomeDouble(5))
//get(NoDouble())