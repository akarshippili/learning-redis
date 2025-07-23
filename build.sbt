import Dependencies._

ThisBuild / scalaVersion     := "2.13.16"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.akarsh"
ThisBuild / organizationName := "akarsh"

lazy val root = (project in file("."))
  .settings(
    name := "learning-redis",
    libraryDependencies += munit % Test,
    libraryDependencies += "redis.clients" % "jedis" % "5.1.0",
    libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.5.3",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.8.5",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.8.5"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
