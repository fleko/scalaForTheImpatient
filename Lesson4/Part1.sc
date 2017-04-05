



class Time (val hours: Int, val minutes: Int = 0) {

  //def this(h: Int) {this(h,0)}

  if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) throw new IllegalStateException("Hours must be between 0 and 23. Minutes must be between 0 and 59")

  def before(other: Time) = { (hours < other.hours) || (hours == other.hours && minutes <= other.minutes) }

  override def toString: String = f"${hours}:${minutes}%02d"

}

val a = new Time(12,10)
val b = new Time(12,0)

a.before(b);

//val c = new Time(26,0)

val d = new Time(13)