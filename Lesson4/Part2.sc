



class Time (h: Int, m: Int = 0) {

  //def this(h: Int) {this(h,0)}


  private var minutesSinceMidnight = h*60+m

  def hours = minutesSinceMidnight/60

  def minutes = minutesSinceMidnight%60

  if (h < 0 || h > 23 || m < 0 || m > 59) throw new IllegalStateException("Hours must be between 0 and 23. Minutes must be between 0 and 59")


  def minutes_=(newVal: Int) {if (newVal > 0 && newVal < 60) minutesSinceMidnight = minutesSinceMidnight/60 + newVal else throw new IllegalArgumentException("Minutes must be between 0 and 59")}

  def before(other: Time) =  minutesSinceMidnight < other.minutesSinceMidnight

  override def toString: String = f"${hours}:${minutes}%02d"

}

val a = new Time(12,10)
val b = new Time(12,0)

a.before(b);

//val c = new Time(26,0)

val d = new Time(13)