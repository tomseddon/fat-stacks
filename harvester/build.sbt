name := """harvester"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0-RC1" % Test,
  "org.webjars" % "bootstrap" % "4.0.0-alpha.2",
  "org.webjars.bower" % "tether" % "1.1.1",
  "org.webjars" % "jquery" % "2.1.4",
  "com.yahoofinance-api" % "YahooFinanceAPI" % "1.3.0"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
