name := "sbt-docker-test"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies += "com.typesafe" % "config" % "1.3.1"

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

maintainer in Docker := "Abdhesh Kumar <abdhesh.mca@gmail.com>"
packageSummary in Docker := "A small docker application"
packageDescription := "Docker [micro|nano] Service"
packageName in Docker := "sbt-docker-test"