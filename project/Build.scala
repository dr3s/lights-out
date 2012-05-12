import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "inthedark"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
     "com.amazonaws" % "aws-java-sdk" % "1.3.7"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
