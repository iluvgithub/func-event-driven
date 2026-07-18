package com.example

import cats.effect.{IO, IOApp}

object HelloName extends IOApp.Simple {

  val program: IO[Unit] =
    for {
      _    <- IO.print("What's your name? ")
      name <- IO.readLine
      _    <- IO.println(s"Hello, $name!")
    } yield ()

  override def run: IO[Unit] = program

}
