package com.kristileka.faker.helper

import com.kristileka.faker.types.{ Address, Domain }

trait InternetHelper extends BaseHelper {
  implicit val domains: Seq[Domain]    = Domain.domains
  val randomDomain: Domain             = getRandom(domains)
  implicit val addresses: Seq[Address] = Address.addresses
  val randomAddress: Address          = getRandom(addresses)
}
