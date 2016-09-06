package com.mogobiz.mirakl

import com.typesafe.config.{Config, ConfigFactory}

/**
  * Created by yoannbaudy on 02/09/2016.
  */
object Settings {

  lazy val config: Config = ConfigFactory.load("mirakl").withFallback(ConfigFactory.load("default-mirakl"))

  lazy val url = config getString "mirakl.url"
  lazy val frontApiKey = config getString "mirakl.frontApiKey"
  lazy val timeout = config getLong "mirakl.timeout"
}

