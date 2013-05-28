import sbt._
import Keys._

object ProjectBuild extends Build {

  val baseSettings = Defaults.defaultSettings ++ Seq(
    organization := "com.example",
    version      := "0.1.0-SNAPSHOT",
    scalaVersion := "2.10.0"
  )

  lazy val project = Project ("future-server", file("."), settings = baseSettings)

}
