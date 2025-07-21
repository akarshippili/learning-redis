package com.akarsh

import redis.clients.jedis.Jedis

object RedisExample extends App {
  // Connect to Redis running on localhost:6379
  val jedis = new Jedis("localhost", 6379)

  // Set a key-value pair
  jedis.set("foo", "bar")
  println("Set key 'foo' to 'bar'")

  // Get the value for the key
  val value = jedis.get("foo")
  println(s"Value for 'foo': $value")

  // Clean up
  jedis.close()
} 