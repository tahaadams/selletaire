scalacOptions ++= Seq( "-unchecked", "-deprecation" )

resolvers += Resolver.typesafeRepo("releases")

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.20")

// SBT-Web plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.1")

// Scala.js
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.13.2")

addSbtPlugin("org.portable-scala" % "sbt-crossproject" % "1.3.1")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.3.1")

addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.2.0")

// Source Control
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.1")

// Benchmarking
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.25")

addSbtPlugin("io.gatling" % "gatling-sbt" % "2.2.1")

// App Packaging
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.10.4")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.1.1")

// Code Quality
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0") // scalastyle

addSbtPlugin("com.sksamuel.scapegoat" %% "sbt-scapegoat" % "1.0.4")

addSbtPlugin("com.orrsella" % "sbt-stats" % "1.0.5") // stats

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2") // dependencyGraph

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.1") // dependencyUpdates

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0") // scalariformFormat

addSbtPlugin("com.github.xuwei-k" % "sbt-class-diagram" % "0.2.1")

// Broken on Windows...
// addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.4.2")

// IDE Integration
addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "0.1.2")

addSbtPlugin("com.orrsella" % "sbt-sublime" % "1.1.1")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.1.0")
