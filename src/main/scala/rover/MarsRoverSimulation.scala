package rover

import models._
import scala.util.Random

class MarsRoverSimulation private[rover](val rover: Rover, val grid: Grid) {

  def issueCommand(command: Command): MarsRoverSimulation = {
    val updatedRover = command match {
      case TurnClockwise => rover.copy(direction = Direction.clockwise(rover.direction))
      case TurnAntiClockwise => rover.copy(direction = Direction.anticlockwise(rover.direction))
      case Forward => rover.copy(position = grid.traverse(rover.position, rover.direction))
    }
    new MarsRoverSimulation(updatedRover, grid)
  }
}


object MarsRoverSimulation {

  def apply(gridSize: Int): MarsRoverSimulation = {
    require(gridSize > 0)

    val rover = Rover(direction = South, Position(0, 0))
    val mapOfMars: Grid = new Grid {
      override def obstacles: List[Position] = List.empty
      override val boundaryX: Int = gridSize
      override val boundaryY: Int = gridSize
    }

    new MarsRoverSimulation(rover, mapOfMars)
  }

}