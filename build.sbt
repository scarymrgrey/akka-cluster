name := "AkkaPerfTest"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.13",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.13" % Test,
  "com.typesafe.akka" %% "akka-cluster" % "2.5.13",
  "com.typesafe.akka" %% "akka-cluster-metrics" % "2.5.13"
)