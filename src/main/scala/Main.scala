import com.typesafe.config.ConfigFactory

object Main extends App {
  val c = ConfigFactory.load()
  println("::::::" + c.toString)
}
