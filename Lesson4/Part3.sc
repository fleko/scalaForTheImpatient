



class Time (h: Int, m: Int = 0) {

  if (h < 0 || h > 23 || m < 0 || m > 59) throw new IllegalStateException("Hours must be between 0 and 23. Minutes must be between 0 and 59")

  private var minutesSinceMidnight = h*60+m

  def hours = minutesSinceMidnight/60

  def minutes = minutesSinceMidnight%60

  def minutes_=(newVal: Int) {if (newVal > 0 && newVal < 60) minutesSinceMidnight = minutesSinceMidnight/60 + newVal else throw new IllegalArgumentException("Minutes must be between 0 and 59")}

  def <(other: Time) =  this - other < 0

  def -(other: Time) = hours * 60 + minutes - other.hours*60 - other.minutes

  override def toString: String = f"${hours}:${minutes}%02d"

}

object Time {
  def apply(h: Int, m: Int = 0) = new Time(h,m)
}

val a = new Time(1,10)
val b = new Time(23,0)

a < b;

a-b;

//val c = new Time(26,0)

val d = new Time(13)

val e = Time(12)