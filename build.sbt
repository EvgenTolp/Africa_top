name := "JSON"

version := "0.1"

scalaVersion := "2.13.6"


val circeVersion = "0.14.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)


libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.12" % "2.4.7" % Provided,
  "org.apache.spark" % "spark-sql_2.12" % "2.4.7" % "provided"
)