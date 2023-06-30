package com.kristileka.faker.types

case class Domain(value: String)

object Domain {
  val domains: Seq[Domain] =
    List(Domain(".com"),
         Domain(".al"),
         Domain(".com.al"),
         Domain(".com.uk"),
         Domain(".com.gb"),
         Domain(".info"),
         Domain(".app"),
         Domain(".de"),
         Domain(".bg"))

}
