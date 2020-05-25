package rover

import models._

trait Grid {

  def boundaryX: Int
  def boundaryY: Int

  def traverse(position: Position, direction: Direction): Position = {
    val updatedPosition = direction match {
      case North => position.copy(y = position.y - 1)
      case East => position.copy(x = position.x + 1)
      case South => position.copy(y = position.y + 1)
      case West => position.copy(x = position.x - 1)
    }


    updatedPosition match {
      case Position(x, y) if x < 0 => Position(boundaryX, y)
      case Position(x, y) if x > boundaryX => Position(0, y)
      case Position(x, y) if y > boundaryY => Position(x, 0)
      case Position(x, y) if y < 0 => Position(x, boundaryY)
      case _ => updatedPosition
    }
  }

}
