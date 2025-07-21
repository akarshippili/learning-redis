import Dependencies._

ThisBuild / scalaVersion     := "2.13.16"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.akarsh"
ThisBuild / organizationName := "akarsh"

lazy val root = (project in file("."))
  .settings(
    name := "learning-redis",
    libraryDependencies += munit % Test,
    libraryDependencies += "redis.clients" % "jedis" % "5.1.0"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
