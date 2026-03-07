libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always

scalacOptions ++= Seq( "-unchecked", "-deprecation" )

resolvers += Resolver.typesafeRepo("releases")

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.20" exclude("com.typesafe.sbt", "sbt-web") exclude("com.typesafe.sbt", "sbt-js-engine"))

// SBT-Web plugins
addSbtPlugin("com.github.sbt" % "sbt-less" % "2.0.0")

addSbtPlugin("com.github.sbt" % "sbt-digest" % "2.0.0")

addSbtPlugin("com.github.sbt" % "sbt-gzip" % "2.0.0")

// Scala.js
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.13.2")

addSbtPlugin("org.portable-scala" % "sbt-crossproject" % "1.3.1")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.3.1")

addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.2.0")

// Source Control
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.1")

// Benchmarking
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.7")

addSbtPlugin("io.gatling" % "gatling-sbt" % "4.3.0")

// App Packaging
addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.16")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.1.1")

// Code Quality
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0") // scalastyle

// addSbtPlugin("com.sksamuel.scapegoat" %% "sbt-scapegoat" % "1.0.19") 

// addSbtPlugin("com.orrsella" % "sbt-stats" % "1.0.5") // stats

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.4") // dependencyUpdates

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3") // scalariformFormat

addSbtPlugin("com.github.xuwei-k" % "sbt-class-diagram" % "0.2.1")

// Broken on Windows...
// addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.4.2")

// IDE Integration
addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "1.1.0")

// addSbtPlugin("com.orrsella" % "sbt-sublime" % "1.1.1")

// addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.1.0")
