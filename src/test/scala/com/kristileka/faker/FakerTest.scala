package com.kristileka.faker

import org.scalatest.featurespec.AnyFeatureSpec

class FakerTest extends AnyFeatureSpec {
  Feature("[1.0] - Faker service Initialization and functions") {
    Scenario("Faker initialies and works") {
      val faker = Faker()

      val email          = faker.internet.email
      val strongPassword = faker.security.strongPassword
      val password       = faker.security.password
      val x              = faker.internet.website
      val xy             = "As"
    }
  }
}
