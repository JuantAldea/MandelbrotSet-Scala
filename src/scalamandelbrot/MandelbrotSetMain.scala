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
 
package scalamandelbrot

import algorithm._
import graphics._

object MandelbrotSetMain {
  def main(args: Array[String]): Unit = {
    val size = 1024
    val maxColorLevel = 255
    val win = new Window(size, size, -2, -1.5, 0.8 + 2, 1.5 + 1.5)
    val imageData = algorithm.MandelbrotSet.calculateMandelbrot(1000, maxColorLevel, win)
    val image = new PGMImage(imageData, maxColorLevel)
    image.write("/tmp/mandel.pgm")
  }
}