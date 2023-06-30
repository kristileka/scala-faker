package com.kristileka.faker

import com.kristileka.faker.helper.BaseHelper
import com.kristileka.faker.providers.{ Country, General, Internet, Personal, Security }

import scala.language.implicitConversions

case class Faker() extends BaseHelper {
  def internet: Internet = Internet()
  def general: General   = General()
  def security: Security = Security()
  def personal: Personal = Personal()
  def country: Country   = Country()
}
