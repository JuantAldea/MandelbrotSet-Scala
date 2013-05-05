/*
 * Juan Antonio Aldea Armenteros (2013)
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