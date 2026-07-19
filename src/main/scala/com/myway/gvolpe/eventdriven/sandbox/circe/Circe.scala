package com.myway.gvolpe.eventdriven.sandbox.circe

import io.circe.Codec

trait Circe

case class Address(
  streetName: String,
  streetNumber: Int,
  flat: Option[String]
) derives Codec.AsObject

case class Person(
  age: Int,
  name: String
) derives Codec.AsObject

enum Digits derives Codec.AsObject:
  case One
  case Two(name: String)
