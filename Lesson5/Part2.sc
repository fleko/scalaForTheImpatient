trait Logged {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logged {
  override def log(msg: String) { println(msg) }
}

class SavingsAccount extends Logged {
  private var balance: Double = 0
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }
  // ...
}

val acct = new SavingsAccount with ConsoleLogger

trait TimestampLogger extends Logged {
  override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)
  }
}

trait ShortLogger extends Logged {
  val maxLength = 15
  override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) msg
      else msg.substring(0, maxLength - 3) + "...")
  }
}

val acct1 = new SavingsAccount with ConsoleLogger
  with TimestampLogger with ShortLogger
acct1.withdraw(1000)

val acct2 = new SavingsAccount
  with ConsoleLogger with ShortLogger with TimestampLogger {
  override val maxLength = 40
}
acct2.withdraw(1000)


val acct3 = new SavingsAccount
  with ShortLogger with TimestampLogger with ConsoleLogger
acct3.withdraw(1000)