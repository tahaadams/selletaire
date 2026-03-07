scalacOptions ++= Seq( "-unchecked", "-deprecation" )

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// Code Quality
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0") // scalastyle

// addSbtPlugin("com.orrsella" % "sbt-stats" % "1.0.5") // stats

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.4") // dependencyUpdates

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3") // scalariformFormat

// addSbtPlugin("com.github.xuwei-k" % "sbt-class-diagram" % "0.1.7")
