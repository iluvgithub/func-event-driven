package com.myway.gvolpe.eventdriven.hello

import munit.CatsEffectSuite

class IoHelloAppSuite extends CatsEffectSuite:

  test("greet returns the expected greeting") {
    IoHelloApp.greet("Alice").map { result =>
      assertEquals(result, "Hello, Alice!")
    }
  }

  test("greet works with another name") {
    IoHelloApp.greet("Bob").map { result =>
      assertEquals(result, "Hello, Bob!")
    }
  }

  test("greet handles an empty name") {
    IoHelloApp.greet("").map { result =>
      assertEquals(result, "Hello, !")
    }
  }