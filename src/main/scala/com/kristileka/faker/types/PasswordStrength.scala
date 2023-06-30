package com.kristileka.faker.types

sealed trait PasswordStrength {
  def strength: Int
}

object PasswordStrength {
  case object ShortWeak   extends PasswordStrength { val strength: Int = 1 }
  case object Weak        extends PasswordStrength { val strength: Int = 1 }
  case object Moderate    extends PasswordStrength { val strength: Int = 1 }
  case object Strong      extends PasswordStrength { val strength: Int = 1 }
  case object SuperStrong extends PasswordStrength { val strength: Int = 1 }
}
