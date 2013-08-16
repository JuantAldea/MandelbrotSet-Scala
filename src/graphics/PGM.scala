/*
Copyright (C) 2013, Juan Antonio Aldea Armenteros
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

/*
 * 5-5-2013
 */
 
package graphics

class PGMImage(val data: List[List[Int]], val maxColorLevel: Int) {
  def write(path: String) = {
    val outFile = new java.io.PrintWriter(path)

    def writeRow(row: List[Int]): Unit = row match {
      case Nil => {
      }
      case x :: xs => {
        outFile.write(x.toString + " ")
        writeRow(xs)
      }
    }

    outFile.println("P2")
    outFile.println(data.head.length.toString + " " + data.length.toString)
    outFile.println(maxColorLevel.toString)
    data map (row => writeRow(row))
    outFile.close()
  }
}
