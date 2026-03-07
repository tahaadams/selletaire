import sbt._

object Dependencies {
  object Play {
    val version = "2.8.20"
    val lib = "com.typesafe.play" %% "play" % version
    val filters = play.sbt.PlayImport.filters
    val ws = play.sbt.PlayImport.ws
    val json = "com.typesafe.play" %% "play-json" % "2.9.4"
    val test = "com.typesafe.play" %% "play-test" % version
    val guice = play.sbt.PlayImport.guice

    val mailer = "com.typesafe.play" %% "play-mailer" % "8.0.1"
    val mailerGuice = "com.typesafe.play" %% "play-mailer-guice" % "8.0.1"
  }

  object Akka {
    private[this] val version = "2.6.21"
    val actor = "com.typesafe.akka" %% "akka-actor" % version
    val cluster = "com.typesafe.akka" %% "akka-cluster" % version
    val contrib = "com.typesafe.akka" %% "akka-contrib" % version
    val persistence = "com.typesafe.akka" %% "akka-persistence" % version
    val remoting = "com.typesafe.akka" %% "akka-remote" % version
    val log4j = "com.typesafe.akka" %% "akka-slf4j" % version
    val testkit = "com.typesafe.akka" %% "akka-testkit" % version
  }

  object Database {
    val hikariCp = "com.zaxxer" % "HikariCP" % "5.1.0"
    val postgres = "org.postgresql" % "postgresql" % "42.7.1"
  }

  object GraphQL {
    val sangria = "org.sangria-graphql" %% "sangria" % "2.1.6"
    val playJson = "org.sangria-graphql" %% "sangria-play-json" % "2.0.2"
    val circe = "org.sangria-graphql" %% "sangria-circe" % "1.3.2"
  }

  object Spark {
    val core = "org.apache.spark" %% "spark-core" % "1.4.1" exclude("org.slf4j", "slf4j-log4j12")
  }

  object WebJars {
    val requireJs = "org.webjars" % "requirejs" % "2.3.6"
    val bootstrap = "org.webjars" % "bootstrap" % "4.6.2"
    val underscore = "org.webjars" % "underscorejs" % "1.8.3"
    val d3 = "org.webjars.npm" % "d3" % "7.8.5"
    val nvd3 = "org.webjars.npm" % "nvd3" % "1.8.6"
    val jquery = "org.webjars" % "jquery" % "3.7.1"
    val materialize = "org.webjars" % "materializecss" % "0.99.0"
  }

  object Serialization {
    val circeVersion = "0.14.6"
    val circeExtrasVersion = "0.14.3"
  }

  object Metrics {
    val version = "0.16.0"
    val metrics = "io.prometheus" % "simpleclient" % version
    val metricsJvm = "io.prometheus" % "simpleclient_hotspot" % version
    val metricsHttp = "io.prometheus" % "simpleclient_httpserver" % version
    val metricsPush = "io.prometheus" % "simpleclient_pushgateway" % version
  }

  object ScalaJS {
    val jQueryVersion = "2.2.0"
    val scalaTagsVersion = "0.12.0"
    val domVersion = "2.2.0"
    val definitelyScalaVersion = "1.0.2"
  }

  object Utils {
    val scapegoatVersion = "1.3.11"
    val enumeratumVersion = "1.7.3"

    val betterFiles = "com.github.pathikrit" %% "better-files" % "3.1.0"
    val xmlBind = "javax.xml.bind" % "jaxb-api" % "2.3.1"
    val slf4j = "org.slf4j" % "slf4j-api" % "1.7.30"
  }

  object Testing {
    val gatlingVersion = "2.3.0"
    val gatlingCore = "io.gatling" % "gatling-test-framework" % gatlingVersion % "test"
    val gatlingCharts = "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test"
  }
}
