package rover

import models._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalacheck.Prop.forAll
import org.scalatest.OptionValues
import org.scalatest.wordspec.AnyWordSpec

import scala.annotation.tailrec

class MarsRoverSimulationSpec extends AnyWordSpec with Matchers with OptionValues {

  "issueCommand" when {
    "turnClockwise" should {
      "update the rovers direction and keep the position the same" in {
        val setup = MarsRoverSimulation(10)
        val result = setup.issueCommand(TurnClockwise)

        result.rover.direction shouldNot equal (setup.rover.direction)
        result.rover.position shouldBe setup.rover.position
      }
    }

    "turnAntiClockwise" should {
      "update the rovers direction and keep the position the same" in {
        val setup = MarsRoverSimulation(10)
        val result = setup.issueCommand(TurnAntiClockwise)

        result.rover.direction shouldNot equal (setup.rover.direction)
        result.rover.position shouldBe setup.rover.position
      }
    }

    "forward" should {
      "update the rovers position and keep the direction the same" in {
        val setup = MarsRoverSimulation(10)
        val result = setup.issueCommand(Forward)

        result.rover.direction shouldBe setup.rover.direction
        result.rover.position shouldNot equal (setup.rover.position)
      }
    }
  }




}
