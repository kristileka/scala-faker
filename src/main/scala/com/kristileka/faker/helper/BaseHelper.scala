package com.kristileka.faker.helper

import scala.util.Random

trait BaseHelper {
  val random: Random = Random
  def getRandom[T](list: Seq[T]): T = {
    val randomIndex: Int = Random.nextInt(list.size)
    list(randomIndex)
  }

  def genLettersNumbers(length: Int): String = {
    val chars        = ('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')
    val randomString = (1 to length).map(_ => chars(random.nextInt(chars.length))).mkString
    randomString
  }

  def genLetters(length: Int): String = {
    val chars        = ('a' to 'z') ++ ('A' to 'Z')
    val randomString = (1 to length).map(_ => chars(random.nextInt(chars.length))).mkString
    randomString
  }

  def genNumbers(length: Int): String = {
    val chars        = ('0' to '9')
    val randomString = (1 to length).map(_ => chars(random.nextInt(chars.length))).mkString
    randomString
  }
}
