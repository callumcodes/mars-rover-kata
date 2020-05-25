# Mars Rover Kata

A kata that implements a simulation of the Mars Rover

## Brief

The next Mars Rover is being developed, and we need you to come up with a simple way of issuing navigation instructions to it from back on Earth! 
 
### Part 1: Basic Movement 
1. The Mars Rover operates on a grid of arbitrary size. 
2. You can only issue three commands: Move forward, rotate clockwise, and rotate anticlockwise. 
3. If the rover moves off the grid, it reappears on the opposite side of the grid. 
### Part 2: Autopilot 1. 
Devise a simple process for determining the shortest possible path from one position on the grid to another. 2. Improve the solution so that it can avoid mountain ranges that occupy a number of inconvenient grid squares scattered around the map. 
### Part 3: Putting it all together 
Output all the instructions and moves carried out by the rover to get from one grid square to another. The output can take any form e.g rows of text, JSON data, or something graphical. 

## Acceptance Criteria Met

* The grid size can be set by the calling code
* The three commands can be issued to the rover
* If the rover moves off the grid, it will reappear at the other side
* Mountains can be placed on the map, which block movement

## Assumptions made

* The rover cannot move diagonally, though could be easily implemented.
* When the rover moves, it moves by one square.

## Running the tests

To run the tests use
```bash
sbt test
```
## Licence
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
