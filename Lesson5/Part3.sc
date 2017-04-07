import java.io._

new BufferedReader(new InputStreamReader(new FileInputStream("/usr/share/dict/words")))

trait Logged {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logged {
  override def log(msg: String) { println(msg) }
}

trait Buffered extends InputStream with Logged{
  val SIZE = 1024
  private var end = 0
  private val buffer = new Array[Byte](SIZE)
  private var pos = 0

  override def read() = {
    if (pos == end) {
      log("buffering")
      end = super.read(buffer, 0, SIZE)
      pos = 0
    }
    if (pos == end) -1 else {
      log("reading")
      pos += 1
      buffer(pos - 1)
    }
  }
}

val fis = new FileInputStream("/usr/share/dict/words") with Buffered with ConsoleLogger

fis.read()

