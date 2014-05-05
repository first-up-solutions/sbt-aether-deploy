version := "0.1"

name := "webdav"

organization := "webdav"

scalaVersion := "2.9.1"

publishTo := Some("dav" at "dav://localhost:8009")

aetherPublishSettings

wagons := Seq(aether.WagonWrapper("dav", "org.apache.maven.wagon.providers.webdav.WebDavWagon"))
