package com.kristileka.faker.providers

import com.kristileka.faker.helper.BaseHelper
import com.kristileka.faker.types.PasswordStrength

case class Security() extends BaseHelper {
  private val specialCharacters = "!@#$%^&*()_+{}|?><~"

  def password: String = mixValues(
    genLettersNumbers(8) +
      genSpecialCharacters(3)
  )

  def strongPassword: String = mixValues(
    genLettersNumbers(12) +
      genSpecialCharacters(8)
  )
  def password(passwordStrength: PasswordStrength): String =
    passwordStrength match {
      case PasswordStrength.ShortWeak   => genNumbers(5)
      case PasswordStrength.Weak        => genNumbers(8)
      case PasswordStrength.Moderate    => genLettersNumbers(8)
      case PasswordStrength.Strong      => password
      case PasswordStrength.SuperStrong => strongPassword
    }

  private def mixValues(values: String): String =
    values.map(_ => values(random.nextInt(values.length))).mkString

  private def genSpecialCharacters(length: Int): String =
    (1 to length).map(_ => specialCharacters(random.nextInt(specialCharacters.length))).mkString
}
