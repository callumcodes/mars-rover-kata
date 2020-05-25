package models

sealed trait Command

case object Forward extends Command
case object TurnClockwise extends Command
case object TurnAntiClockwise extends Command
