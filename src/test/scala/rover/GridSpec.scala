package rover

import models._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class GridSpec extends AnyWordSpec with Matchers {

  val grid = new Grid {
    override val boundaryX = 10
    override val boundaryY = 10
  }

  "traverse" when {
    "facing East" should {
      "increment the x position by 1" in {
        (0 until 10).foreach { i =>
          grid.traverse(Position(i, 0), East) shouldBe Position(i + 1, 0)
        }
      }
    }

    "facing South" should {
      "increment the y position by 1" in {
        (0 until 10).foreach { i =>
          grid.traverse(Position(0, i), South) shouldBe Position(0, i + 1)
        }
      }
    }

    "facing North" should {
      "Decrement the y position by 1" in {
        (1 to 10).foreach { i =>
          grid.traverse(Position(0, i), North) shouldBe Position(0, i - 1)
        }
      }
    }

    "facing West" should {
      "Decrement the X position by 1" in {
        (1 to 10).foreach { i =>
          grid.traverse(Position(i, 0), West) shouldBe Position(i - 1, 0)
        }
      }
    }

    "moving outside the west boundary" should {
      "wrap around to the east boundary" in {
        grid.traverse(Position(0, 0), West) shouldBe Position(10, 0)
      }
    }

    "moving outside the east boundary" should {
      "wrap around to the west boundary" in {
        grid.traverse(Position(10, 0), East) shouldBe Position(0, 0)
      }
    }

    "moving outside the north boundary" should {
      "wrap around to the south boundary" in {
        grid.traverse(Position(0, 0), North) shouldBe Position(0, 10)
      }
    }


    "moving outside the south boundary" should {
      "wrap around to the north boundary" in {
        grid.traverse(Position(0, 10), South) shouldBe Position(0, 0)
      }
    }

  }
}
