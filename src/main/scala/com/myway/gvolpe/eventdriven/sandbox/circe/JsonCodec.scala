package com.myway.gvolpe.eventdriven.sandbox.circe

import io.circe.Codec
import io.circe.parser.decode
import io.circe.syntax.*

case class Address(
  streetName: String,
  streetNumber: Int,
  flat: Option[String]
) derives Codec.AsObject
