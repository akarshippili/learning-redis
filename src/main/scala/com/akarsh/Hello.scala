package com.akarsh

object Hello extends Greeting with App {
  println("Hello World!!!")
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = {
    println("hello lazy")
    "hello"
  }
}
