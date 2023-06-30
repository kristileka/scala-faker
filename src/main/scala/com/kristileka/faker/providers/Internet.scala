package com.kristileka.faker.providers

import com.kristileka.faker.helper.InternetHelper

case class Internet() extends InternetHelper {
  def email: String   = genLettersNumbers(10) + "@" + randomAddress.value
  def website: String = randomAddress.value
}
