//
// Make sure to separate lines by a blank line
//

organization := "com.rikmo"

name := "my-scala-project"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.0"

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.M5b" % "test"

libraryDependencies += "org.apache.karaf.shell" % "org.apache.karaf.shell.console" % "2.3.0"

osgiSettings

// Export your stuff here
//OsgiKeys.exportPackage := Seq("com.rikmo.policy.karaf.commands.*")

OsgiKeys.importPackage := Seq("org.apache.felix.service.command",
                              "org.apache.felix.gogo.commands",
                              "org.apache.karaf.shell.console",
                              "*")
