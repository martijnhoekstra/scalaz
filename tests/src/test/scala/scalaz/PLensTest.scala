package scalaz

import std.AllInstances._
import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Arbitrary}

object PLensTest extends SpecLite {
  import PLens._

  "list head" in {
    listHeadPLens[Int].get(List(1, 2)) must_===(Some(1))
    listHeadPLens[Int].get(Nil) must_===(None)
  }

  object instances {
    def category = Category[PLens]
    def choice = Choice[PLens]
    def split = Split[PLens]
  }

}
