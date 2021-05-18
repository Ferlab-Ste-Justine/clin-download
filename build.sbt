name := """ferload"""
organization := "bio.ferlab"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
val keycloakVersion = "12.0.4"

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += caffeine
libraryDependencies += ws
libraryDependencies += "com.amazonaws" % "aws-java-sdk-bom" % "1.11.880"
libraryDependencies += "com.amazonaws" % "aws-java-sdk-s3" % "1.11.880"
libraryDependencies += "org.keycloak" % "keycloak-core" % keycloakVersion
//libraryDependencies += "org.keycloak" % "keycloak-adapter-core" % keycloakVersion
libraryDependencies += "org.mockito" % "mockito-core" % "3.8.0" % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "bio.ferlab.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "bio.ferlab.binders._"
