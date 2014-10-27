name := "buyTicket_performance"

version := "1.0"

scalaVersion := "2.10.4"

val test = project.in(file("."))
  .enablePlugins(GatlingPlugin)
  .settings(libraryDependencies ++= Seq("io.gatling" % "gatling-core" % "2.0.1" % "test",
                                        "io.gatling" % "gatling-http" % "2.0.1" % "test",
                                        "io.gatling" % "gatling-charts" % "2.0.1" % "test",
                                        "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.0.1" % "test",
                                        "io.gatling" % "test-framework" % "1.0" % "test"))
