import com.typesafe.config.ConfigFactory

object Main extends App {
  val c = ConfigFactory.load()
  println("::::::" + c.getString("test.name"))
  Thread.sleep(50000)
}
