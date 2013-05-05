/*
 * Juan Antonio Aldea Armenteros (5-5-2013)
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
