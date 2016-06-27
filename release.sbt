import sbtrelease._
import ReleaseTransformations._

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  setNextVersion,
  commitNextVersion
)

// publishing
publishMavenStyle := true

// use maven style tag name
releaseTagName := s"config-${(version in ThisBuild).value}"

// support the forked versioning
releaseVersion     := { ver =>
  Version(ver).map(v => {
      v.copy(qualifier = v.qualifier.map(_.stripSuffix("-SNAPSHOT"))).string
    })
    .getOrElse(versionFormatError)
}

releaseNextVersion := { ver =>
  Version(ver).map(v => {
    v.copy(qualifier = v.qualifier.map(q => {
      val Pattern = """-usermind-(\d+)""".r
      q match {
        case Pattern(n) => f"-usermind-${(n.toInt+1)}%02d-SNAPSHOT"
      }
    })).string
  }).getOrElse(versionFormatError)
}
