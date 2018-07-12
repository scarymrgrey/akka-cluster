package sample.cluster.simple

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

object SimpleClusterApp extends App {
  println("1 - master")
  println("2 - slave")
  Console.in.readLine() match {
    case "1" =>
      val config = ConfigFactory.load("application")
      val system = ActorSystem("ClusterSystem",config)
      val backend = system.actorOf(Props[BackendActor],
        name = "factorialBackendRouter")
      backend ! "hello world"
    case "2" =>
      BackendActor.main()
  }

}
