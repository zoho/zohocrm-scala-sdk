name := "scala-sdk"
scalaVersion := "2.13.1"
version:="0.0.1"
organization:="com.zoho.crm"
organizationName:="zoho"
organizationHomepage :=Some(url("https://www.zoho.com/crm/"))
description := "An API client for CRM customers, with which they can call ZOHO CRM APIs with ease"
publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
developers := List(
  Developer(
    id = "ZOHO CRM API TEAM",
    name = "ZOHO CRM API TEAM",
    email = "support@zohocrm.com",
    url = url("https://github.com/zoho/zohocrm-scala-sdk")
  )
)
useGpgPinentry := true
crossPaths := false
pomExtra :=
  <url>https://github.com/zoho/zohocrm-scala-sdk</url>
    <scm>
      <url>https://github.com/zoho/zohocrm-scala-sdk</url>
      <connection>scm:git:git@github.com:zoho/zohocrm-scala-sdk</connection>
    </scm>
licenses := Seq(
  "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")
)
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.47",
  "org.json" % "json" % "20170516",
  "org.apache.httpcomponents" % "httpcore" % "4.4.6",
  "org.apache.httpcomponents" % "httpclient" % "4.5.3",
  "org.apache.httpcomponents" % "httpmime" % "4.5",
  "org.apache.commons" % "commons-io" % "1.3.2",
)

