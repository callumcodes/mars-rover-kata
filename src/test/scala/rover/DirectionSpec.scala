package rover

import models._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class DirectionSpec extends AnyWordSpec with Matchers {

  "clockwise" when {
    "North" should {
      "become East" in {
        Direction.clockwise(North) shouldBe East
      }
    }
    "East" should {
      "become South" in {
        Direction.clockwise(East) shouldBe South
      }
    }
    "South" should {
      "become West" in {
        Direction.clockwise(South) shouldBe West
      }
    }
    "West" should {
      "become North" in {
        Direction.clockwise(West) shouldBe North
      }
    }
  }

  "anticlockwise" when {
    "North" should {
      "become West" in {
        Direction.anticlockwise(North) shouldBe West
      }
    }

    "West" should {
      "become South" in {
        Direction.anticlockwise(West) shouldBe South
      }
    }

    "South" should {
      "become East" in {
        Direction.anticlockwise(South) shouldBe East
      }
    }

    "East" should {
      "become North" in {
        Direction.anticlockwise(East) shouldBe North
      }
    }

  }
}
