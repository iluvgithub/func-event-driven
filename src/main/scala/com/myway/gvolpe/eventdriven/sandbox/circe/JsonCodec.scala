package com.myway.gvolpe.eventdriven.sandbox.circe

import io.circe.Codec

trait JsonCodec

case class Address(
  streetName: String,
  streetNumber: Int,
  flat: Option[String]
) derives Codec.AsObject
