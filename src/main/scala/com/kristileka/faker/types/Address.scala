package com.kristileka.faker.types

case class Address(value: String)

object Address {
  val addresses: Seq[Address] =
    List(
      Address("google.com"),
      Address("facebook.com"),
      Address("android.com"),
      Address("news.com.uk"),
      Address("runner.com.gb"),
      Address("technical.info"),
      Address("faker.app"),
      Address("mobile.de"),
      Address("uber.bg")
    )

}
