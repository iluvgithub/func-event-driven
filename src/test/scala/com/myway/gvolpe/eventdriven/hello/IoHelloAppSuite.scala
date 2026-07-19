package com.myway.gvolpe.eventdriven.hello

import cats.effect.*
import cats.effect.testkit.TestConsole
import munit.CatsEffectSuite

class IoHelloAppSuite extends CatsEffectSuite:

  test("greet returns the expected greeting"):    
    IoHelloApp.greet[IO]("Alice").map { result =>
      assertEquals(result, "Hello, Alice!")
    }




