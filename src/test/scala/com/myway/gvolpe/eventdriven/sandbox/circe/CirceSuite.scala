package com.myway.gvolpe.eventdriven.sandbox.circe

import io.circe
import io.circe.parser.decode
import io.circe.syntax.*
import munit.CatsEffectSuite
class CirceSuite extends CatsEffectSuite:

  test("to json"):
    // arrange
    val address = Address("Baker", 221, Some("B"))
    // act
    val jsonString = address.asJson.noSpaces
    // assert
    assertEquals("{\"streetName\":\"Baker\",\"streetNumber\":221,\"flat\":\"B\"}", jsonString)

  test("from Json ok"):
    // arrange
    val jsonString = "{\"streetName\":\"Baker\",\"streetNumber\":221,\"flat\":\"B\"}"
    // act
    val decoded: Either[circe.Error, Address] = decode[Address](jsonString)
    // assert
    assertEquals(decoded, Right(Address("Baker", 221, Some("B"))))

  test("from Json not ok"):
    // arrange
    val jsonString = "{\"WRONG_FIELD\":\"Baker\",\"streetNumber\":221,\"flat\":\"B\"}"
    // act
    val decoded: Either[circe.Error, Address] = decode[Address](jsonString)
    // assert
    assertEquals(
      decoded.fold(_.toString, _ => ""),
      "DecodingFailure at .streetName: Missing required field"
    )
