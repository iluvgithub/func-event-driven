package com.myway.gvolpe.eventdriven.hello

import cats.effect.{IO, IOApp}

object HelloName extends IOApp.Simple:

  /** Business logic that is easy to test */
  def greet(name: String): IO[String] =
    IO.pure(s"Hello, $name!")

  /** Interactive program */
  val program: IO[Unit] =
    for
      _       <- IO.print("What's your name? ")
      name    <- IO.readLine
      greeting <- greet(name)
      _       <- IO.println(greeting)
    yield ()

  override def run: IO[Unit] =
    program