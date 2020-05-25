package models

sealed trait Direction

case object North extends Direction
case object East extends Direction
case object South extends Direction
case object West extends Direction


import scala.math.floorMod
object Direction {
  def clockwise(direction: Direction): Direction = {
    direction match {
      case North => East
      case East => South
      case South => West
      case West => North
    }
  }

  def anticlockwise(direction: Direction): Direction = {
    direction match {
      case North => West
      case West => South
      case South => East
      case East => North
    }
  }
}