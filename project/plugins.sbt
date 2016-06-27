addSbtPlugin("de.johoop" % "findbugs4sbt" % "1.4.0")
addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.6.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.1")

addSbtPlugin("com.etsy" % "sbt-checkstyle-plugin" % "0.4.1")

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-javaversioncheck" % "0.1.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")
