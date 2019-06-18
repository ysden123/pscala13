import Dependencies._

ThisBuild / scalaVersion     := "2.13.0"
ThisBuild / version          := "1.0.0"
ThisBuild / organization     := "com.stulsoft"
ThisBuild / organizationName := "StulSoft"

lazy val root = (project in file("."))
  .settings(
    name := "pscala13",
    libraryDependencies += scalaTest % Test
  )
