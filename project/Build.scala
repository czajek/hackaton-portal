import sbt._
import Keys._
import PlayProject._
import com.typesafe.sbteclipse.core.EclipsePlugin.EclipseKeys
import de.johoop.jacoco4sbt.JacocoPlugin._
import de.johoop.cpd4sbt.CopyPasteDetector._
import de.johoop.findbugs4sbt.FindBugs._

object ApplicationBuild extends Build {

  val appName = "hackaton-portal"
  val appVersion = "0.2-SNAPSHOT"

  val newSettings = Defaults.defaultSettings ++ Seq(
    EclipseKeys.skipParents in ThisBuild := false) ++ Seq(jacoco.settings: _*) ++
    Seq(cpdSettings : _*) ++ Seq(findbugsSettings : _*)

<<<<<<< HEAD
    val appDependencies = Seq(
      "org.squeryl" %% "squeryl" % "0.9.5-2",
      "com.h2database" % "h2" % "1.3.168",
      "postgresql" % "postgresql" % "9.1-901.jdbc4",
      "net.databinder" %% "dispatch-http" % "0.8.7",
      "net.databinder" %% "dispatch-mime" % "0.8.7",
      "net.databinder" %% "dispatch-json" % "0.8.7",
      "com.typesafe" %% "play-plugins-util" % "2.0.1",
      "org.mindrot" % "jbcrypt" % "0.3m",
      "org.webjars" % "bootstrap" % "2.1.1",
      "org.webjars" % "jquery" % "1.8.2"
    )
    
    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA)
=======
  val appDependencies = Seq(
    "org.squeryl" %% "squeryl" % "0.9.5-2",
    "com.h2database" % "h2" % "1.3.168",
    "postgresql" % "postgresql" % "9.1-901.jdbc4",
    "rome" % "rome" % "1.0",
    "net.databinder" %% "dispatch-http" % "0.8.7",
    "net.databinder" %% "dispatch-mime" % "0.8.7",
    "net.databinder" %% "dispatch-json" % "0.8.7",
    "com.typesafe" %% "play-plugins-util" % "2.0.1",
    "org.mindrot" % "jbcrypt" % "0.3m",
    "com.github.mumoshu" %% "play2-memcached" % "0.2.1-SNAPSHOT",
    "com.mongodb.casbah" %% "casbah" % "2.1.5-1",
    "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT")

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA, settings = newSettings)
>>>>>>> a73c2a53af588850cff2e6f325741991ea361a03
    .settings(
      parallelExecution in jacoco.Config := false,
      coffeescriptOptions := Seq("bare"),
      resolvers ++= Seq(
        "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
<<<<<<< HEAD
        "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
      ),
      resolvers += "webjars" at "http://webjars.github.com/m2"
    )
=======
        "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
        "Sonatype OSS Snapshots Repository" at "http://oss.sonatype.org/content/groups/public",
        "Spy Repository" at "http://files.couchbase.com/maven2",
        "repo.novus snaps" at "http://repo.novus.com/snapshots/"))
>>>>>>> a73c2a53af588850cff2e6f325741991ea361a03
}
