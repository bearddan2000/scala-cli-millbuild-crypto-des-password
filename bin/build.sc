import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object RSA extends ScalaModule {
    def scalaVersion = "2.13.0"

    def ivyDeps = Agg(
        ivy"commons-codec:commons-codec:1.15"
    )
}
