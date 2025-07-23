package com.akarsh

import akka.actor.{ActorSystem, Props}
import scala.io.StdIn
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route.seal
import scala.concurrent.ExecutionContext

object HttpServer extends App {
    implicit val actorSystem: ActorSystem = ActorSystem("HttpServer")
    implicit val executionContext: ExecutionContext = actorSystem.dispatcher

    val route = path("hello") {
        get {
            complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Hello, World!</h1>"))
        }
    }

    val bindingFuture = Http().newServerAt("localhost", 8080).bind(route)
    println(s"Server online at http://localhost:8080/hello")

    StdIn.readLine()
    bindingFuture
      .flatMap(_.unbind())
      .onComplete(_ => actorSystem.terminate())
}
