
package com.example

import munit.CatsEffectSuite

class HelloNameSuite extends CatsEffectSuite {

  test("greet returns the expected greeting") {
    HelloName.greet("Alice").map { greeting =>
      assertEquals(greeting, "Hello, Alice!")
    }
  }

}
