package com.myway.gvolpe.eventdriven.hello

import munit.CatsEffectSuite

class IoHelloAppSuite extends CatsEffectSuite:

  test("greet returns the expected greeting") {
    HelloName.greet("Alice").map { result =>
      assertEquals(result, "Hello, Alice!")
    }
  }

  test("greet works with another name") {
    HelloName.greet("Bob").map { result =>
      assertEquals(result, "Hello, Bob!")
    }
  }

  test("greet handles an empty name") {
    HelloName.greet("").map { result =>
      assertEquals(result, "Hello, !")
    }
  }