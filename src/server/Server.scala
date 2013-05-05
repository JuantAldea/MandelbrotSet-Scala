/*
 * Juan Antonio Aldea Armenteros (5-5-2013)
 */

package server

import scala.actors.Actor
import scala.actors.Actor._

case class TaskRequest
case class TaskResponse(column: Int)
case class TaskFinish
case class TaskSolution(columnNumber: Int, columnData: List[Int])

class Server extends Actor {
    def act() = loop {
      react {
        case TaskRequest => {
          
        }
        case TaskSolution(column, data) => {}
      }
    }
}